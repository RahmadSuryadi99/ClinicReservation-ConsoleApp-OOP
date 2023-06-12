package view;

import data.ClinicHorusData;
import helper.Validation;
import model.FormRegistModel;
import model.Treatment;
import service.AddPatientService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class FormRegistDialog{

    public static Scanner userInput = new Scanner(System.in);
    public static FormRegistModel formRegistTreatmen(){
        AddPatientService.printPatient();
        System.out.println("Pilih salah satu patient dengan meng-Input Id-nya:");
        String id = Validation.cekPatientById(userInput.nextLine());
        System.out.println("Input durasi dalam menit:");
        int duration = Validation.checkIntegerOnly();
        System.out.println("Input tanggal dan jam mulai treatment (dd/MM/yyyy HH:mm):");
        LocalDateTime treatmentDateTime = Validation.checkFormatDate(userInput.nextLine(), duration);
        return new FormRegistModel(treatmentDateTime, ClinicHorusData.patients.get(id),duration);
    }
}
