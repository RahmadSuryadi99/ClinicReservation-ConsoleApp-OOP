package model;

import helper.Formater;
import helper.OtherMethod;

import java.time.LocalDateTime;

public abstract class Treatment {
    private LocalDateTime treatmentStartDate;
    private LocalDateTime treatmentEndDate;
    private Patient patient;
    private int duration;


    public Treatment(){};
    public Treatment(LocalDateTime treatmentStartDate, int duration) {
        this.treatmentStartDate = treatmentStartDate;
        this.duration = duration;
    }

    public Treatment(LocalDateTime treatmentStartDate, Patient patient, int duration) {
        this.treatmentStartDate = treatmentStartDate;
        this.patient = patient;
        this.duration = duration;
    }

    public LocalDateTime getTreatmentEndDate() {
        return treatmentEndDate;
    }

    public void setTreatmentEndDate(LocalDateTime treatmentEndDate) {
        this.treatmentEndDate = treatmentEndDate;
    }

    protected void printDateAndName(){
        System.out.printf("%s -  %s, Patient: %s",Formater.dateFormatIndo(treatmentStartDate)   , Formater.dateFormatIndo(OtherMethod.getTreatmentEndDateTime(this.treatmentStartDate,duration)), patient.getName());
    };
    public abstract void printSchedule();

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
