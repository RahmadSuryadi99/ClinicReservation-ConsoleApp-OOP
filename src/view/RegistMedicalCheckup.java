package view;

import helper.OtherMethod;
import helper.Validation;
import model.FormRegistModel;
import model.MedicalTreatment;
import service.TreatmenSchudleService;

public class RegistMedicalCheckup implements Menu {
    private static RegistMedicalCheckup instance = new RegistMedicalCheckup();
    public static RegistMedicalCheckup getInstance() {
        return instance;
    }
    @Override
    public void run() {
        FormRegistModel result = FormRegistDialog.formRegistTreatmen();
        System.out.println("Input nama dokter:");
        String namaDokter =Validation.inputRequired();
        OtherMethod.printListTreatment();
        System.out.println("Input code checkup method yang tersedia di atas ");
        String code = Validation.checkTreatmentByCode(userInput.nextLine());
        TreatmenSchudleService.add(new MedicalTreatment(result.getTreatmentStartDate(),result.getDuration(),namaDokter,result.getPatient()),code);
        System.out.print("=".repeat(30));
        System.out.print("Entry medical checkup selesai");
        System.out.println("=".repeat(30));
        MainMenu.getInstance().run();
    }

}
