package service;

import data.ClinicHorusData;

public class Initialization {

    public static void initTreatments(){
        ClinicHorusData.treatments.put("CT","CT Scan");
        ClinicHorusData.treatments.put("MRI","Magnetic Resonance Imaging");
        ClinicHorusData.treatments.put("BP","Blood Pressure");
        ClinicHorusData.treatments.put("Lab","Laboratory Test");
        ClinicHorusData.treatments.put("ECG","Electorcardiogram");
    }

}
