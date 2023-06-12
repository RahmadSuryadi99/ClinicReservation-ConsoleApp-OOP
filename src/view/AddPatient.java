package view;

import helper.Validation;
import model.ChronicDisease;
import model.Patient;
import service.AddPatientService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddPatient implements Menu {
    private static AddPatient instance = new AddPatient();

    public static AddPatient getInstance() {
        return instance;
    }

    @Override
    public void run() {
        AddPatientService.printPatient();
        System.out.println("Input patient Id (Patient Id harus unik, menginput id yang sama akan me-replace patient sebelumnya):");
        String id = Validation.inputRequired();
        System.out.println("Input nama patient:");
        String name = Validation.inputRequired();
        System.out.println("Input tanggal lahir patient (dd/MM/yyyy)");
        LocalDate birthDate = Validation.checkFormatDate(userInput.nextLine());
        Patient patient = new Patient(id, name, birthDate);
        patient.setDisease(valdationUsia(patient, new ArrayList<>()));
        AddPatientService.add(patient);
        System.out.println("===============Entry patient selesai===============");
        MainMenu.getInstance().run();
    }


    public static List<ChronicDisease> valdationUsia(Patient patient, List<ChronicDisease> diseases) {
        String diseaseName;
        String description;
        int age = patient.getAge();
        if (age >= 65) {
            System.out.println("Apakah patient memiliki penyakit kronis? (Y/N)");
            String input = Validation.inputRequired().toUpperCase();
            if (input.equals("Y")) {
                System.out.println("Nama penyakit:");
                diseaseName = Validation.inputRequired();
                System.out.println("Keterangan:");
                description = Validation.inputRequired();
                var data = new ChronicDisease(diseaseName, description);
                diseases.add(data);
                return valdationUsia(patient, diseases);
            } else {
                return diseases;
            }
        }
        return null;
    }
}
