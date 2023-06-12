package helper;

import data.ClinicHorusData;
import model.Treatment;
import view.MainMenu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Validation {


    public static String inputRequired() {
        Scanner userInput = new Scanner(System.in);
        String input = userInput.nextLine();
        if (!input.isBlank()) {
            return input;
        } else {
            System.out.println("input tidak boleh kosong!\nmasukan kembali:");
            return inputRequired();
        }

    }

    public static void validasiPatientIsEmpty(int input) {
        if (input > 1 && input < 5) {
            if (ClinicHorusData.patients.isEmpty()) {
                System.out.println("data patient kosong,tambah patient dahulu sebelum memilih menu lain");
                MainMenu.getInstance().run();
            }
        }
    }

    public static String cekPatientById(String id) {
        if (ClinicHorusData.patients.containsKey(id)) {
            return id;
        } else {
            System.out.println("Patient tidak ditemukan,silahkan coba lagi.");
            System.out.println("Pilih salah satu patient dengan meng-Input Id-nya:");
            return cekPatientById(inputRequired());
        }
    }

    public static int checkIntegerOnly() {
        try {
            return Integer.parseInt(inputRequired());
        } catch (Exception e) {
            System.out.println("Harus masukan bilangan bulat");
            System.out.println("Inputkan bilangan bulat:");
            return checkIntegerOnly();
        }
    }

    public static LocalDate checkFormatDate(String dateString) {
        LocalDate date = null;
        try {
            date = Formater.stringToDate(dateString);
            date = validateInputBeforeCurrentDate(date);
        } catch (Exception e) {
            System.out.println("Input tanggal tidak dalam format yang benar, coba lagi.");
            System.out.println("Input tanggal lahir patient (dd/MM/yyyy)");
            date = checkFormatDate(inputRequired());
        }
        return date;
    }

    public static LocalDateTime checkFormatDate(String dateString, int duration) {
        LocalDateTime date = null;
        try {
            date = Formater.stringToDate(dateString, duration);
            validateInputAfterCurrentDate(date, duration);
            checkSchedule(date, duration);

        } catch (Exception e) {
            System.out.println("Input tanggal tidak dalam format yang benar, coba lagi.");
            System.out.println("Input tanggal lahir patient (dd/MM/yyyy MM:yy)");
            date = checkFormatDate(inputRequired(), duration);
        }
        return date;
    }

    public static int checkNumberOnly(String StringNumber) {
        try {
            return Integer.parseInt(StringNumber);
        } catch (Exception e) {
            System.out.println("Harus masukan angka 1-6,coba lagi!");
            MainMenu.getInstance().run();
            return 0;
        }
    }

    public static String checkTreatmentByCode(String code) {
        if (ClinicHorusData.treatments.containsKey(code)) {
            return code;
        } else {
            System.out.println("Method code tidak tersedia");
            System.out.println("Input code checkup method yang tersedia di atas ");
            return checkTreatmentByCode(inputRequired());
        }
    }

    public static LocalDateTime validateInputAfterCurrentDate(LocalDateTime date, int menit) {
        if (!date.isBefore(LocalDateTime.now())) {
            return date;
        } else {
            System.out.println("masukan ulang input tidak boleh sebelum dari tanggal dan waktu sekrang");
            return checkFormatDate(inputRequired(), menit);

        }
    }

    public static LocalDate validateInputBeforeCurrentDate(LocalDate date) {
        if (date.isBefore(LocalDate.now())) {
            return date;
        } else {
            System.out.println("masukan ulang input tidak boleh lebih dari tanggal dan waktu sekrang");
            return checkFormatDate(inputRequired());
        }
    }

    public static LocalDateTime checkSchedule(LocalDateTime date, int duration) {
        LocalDateTime startDate = date;
        LocalDateTime endDate = OtherMethod.getTreatmentEndDateTime(date,duration);
        for (Treatment treatmentSchedule : ClinicHorusData.treatmentSchedules) {
            if (!(startDate.isAfter(treatmentSchedule.getTreatmentEndDate())) || !(endDate.isAfter(treatmentSchedule.getTreatmentStartDate()))) {
                System.out.println("Waktu mulai tidak available,silahkan masukan waktu lainya.");
                return checkFormatDate(inputRequired(), duration);
            }
        }
        return startDate;
    }
}
