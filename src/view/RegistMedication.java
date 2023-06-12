package view;

import helper.Validation;
import model.FormRegistModel;
import model.MedicalTreatment;
import model.MedicationTreatment;
import model.Treatment;
import service.TreatmenSchudleService;

public class RegistMedication implements Menu {
    private static RegistMedication instance = new RegistMedication();

    public static RegistMedication getInstance() {
        return instance;
    }

    @Override
    public void run() {
        FormRegistModel result = FormRegistDialog.formRegistTreatmen();
        System.out.println("Input nama medication");
        String medicine = Validation.inputRequired();
        System.out.println("Input quantity medication");
        int quantity = Validation.checkIntegerOnly();
        TreatmenSchudleService.add(new MedicationTreatment(result.getTreatmentStartDate(),result.getPatient(),result.getDuration(),medicine,quantity));
        System.out.print("=".repeat(30));
        System.out.print("Entry medication selesai");
        System.out.println("=".repeat(30));
        MainMenu.getInstance().run();
    }
}
