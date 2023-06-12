package model;

import data.ClinicHorusData;

import java.time.LocalDateTime;

public class MedicalTreatment extends Treatment {
    private String treatmentMethod;
    private String doctorName;

    public MedicalTreatment(LocalDateTime treatmentDateTime, int duration, String doctorName,Patient patient) {
        super(treatmentDateTime,patient ,duration);
        this.doctorName = doctorName;

    }
    public String getTreatmentMethod() {
        return treatmentMethod;
    }

    public void setTreatmentMethod(String treatmentMethod) {
        this.treatmentMethod = treatmentMethod;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    @Override
    public void printSchedule() {
        printDateAndName();
        System.out.printf("\n[Medical Checkup] - Method: %s, Doctor: %s", treatmentMethod, doctorName);
    }
}
