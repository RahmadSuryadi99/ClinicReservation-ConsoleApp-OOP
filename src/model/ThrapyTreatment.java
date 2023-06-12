package model;

import java.time.LocalDateTime;

public class ThrapyTreatment extends Treatment {
    private String treatment ;
    private String therapist;

    @Override
    public void printSchedule() {
        printDateAndName();
        System.out.printf("\n[Therapy] - Treatment: %s, Therapist: %s",treatment,therapist);
    }

    public ThrapyTreatment() {
    }

    public ThrapyTreatment(LocalDateTime treatmentStartDate, Patient patient, int duration, String treatment, String therapist) {
        super(treatmentStartDate, patient, duration);
        this.treatment = treatment;
        this.therapist = therapist;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getTherapist() {
        return therapist;
    }

    public void setTherapist(String therapist) {
        this.therapist = therapist;
    }
}
