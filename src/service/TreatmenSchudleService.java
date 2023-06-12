package service;

import data.ClinicHorusData;
import model.MedicalTreatment;
import model.MedicationTreatment;
import model.ThrapyTreatment;
import model.Treatment;
import view.MainMenu;

import java.util.List;

public class TreatmenSchudleService {
    public static void printAllSchdule() {
        var treatment = ClinicHorusData.treatmentSchedules;
        if(!treatment.isEmpty()){

        for (Treatment treatmentSchadule : treatment) {
            treatmentSchadule.printSchedule();
            System.out.println("");
            System.out.println("=".repeat(50));
        }
        }else {
            System.out.println("data schadule kosong");
            MainMenu.getInstance().run();
        }
    }
    public static void  add(MedicalTreatment data, String code){
        data.setTreatmentMethod(ClinicHorusData.treatments.get(code));
        ClinicHorusData.treatmentSchedules.add(data);
    }
    public static void  add(MedicationTreatment data){
        ClinicHorusData.treatmentSchedules.add(data);
    }
    public static void  add(ThrapyTreatment data){
        ClinicHorusData.treatmentSchedules.add(data);
    }
}
