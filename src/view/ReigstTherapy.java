package view;

import helper.Validation;
import model.FormRegistModel;
import model.ThrapyTreatment;
import model.Treatment;
import service.TreatmenSchudleService;

public class ReigstTherapy implements Menu{
    private static ReigstTherapy instance = new ReigstTherapy();

    public static ReigstTherapy getInstance() {
        return instance;
    }

    @Override
    public void run() {
        FormRegistModel result = FormRegistDialog.formRegistTreatmen();
        System.out.println("Input nama treatment");
        String treathment = Validation.inputRequired();
        System.out.println("Input nama therapist");
        String therapist = Validation.inputRequired();
        TreatmenSchudleService.add(new ThrapyTreatment(result.getTreatmentStartDate(),result.getPatient(),result.getDuration(),treathment,therapist));
        System.out.print("=".repeat(30));
        System.out.print("Entry medication selesai");
        System.out.println("=".repeat(30));
        MainMenu.getInstance().run();
    }
}
