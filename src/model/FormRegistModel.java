package model;

import java.time.LocalDateTime;

public class FormRegistModel {
    private LocalDateTime treatmentStartDate;
    private Patient patient;
    private int duration;

    public FormRegistModel(LocalDateTime treatmentStartDate, Patient patient, int duration) {
        this.treatmentStartDate = treatmentStartDate;
        this.patient = patient;
        this.duration = duration;
    }

    public LocalDateTime getTreatmentStartDate() {
        return treatmentStartDate;
    }

    public void setTreatmentStartDate(LocalDateTime treatmentStartDate) {
        this.treatmentStartDate = treatmentStartDate;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
