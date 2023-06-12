package view;

import helper.Validation;
import model.Treatment;

import java.util.Scanner;

public class MainMenu implements Menu {
    private static MainMenu instance = new MainMenu();

    public static MainMenu getInstance() {
        return instance;
    }

    @Override
    public void run() {

        System.out.println("""
                Input salah satu angka menu:
                1.  Tambah patient
                2.  Daftar Medical Checkup
                3.  Daftar Medication
                4.  Daftar Therapy
                5.  Treatment Schedule
                6.  Exit application
                """);
        System.out.print("Pilihan anda: ");
        int selection = Validation.checkNumberOnly(userInput.nextLine());
        Validation.validasiPatientIsEmpty(selection);
        navigateMenu(selection);
    }

    private void navigateMenu(int selection) {
        switch (selection) {
            case 1 -> AddPatient.getInstance().run();
            case 2 -> RegistMedicalCheckup.getInstance().run();
            case 3 -> RegistMedication.getInstance().run();
            case 4 -> ReigstTherapy.getInstance().run();
            case 5 -> TreatmenSchdule.getInstance().run();
            case 6 -> System.exit(0);
            default -> run();
        }
    }
}
