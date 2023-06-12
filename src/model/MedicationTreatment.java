package model;

import java.time.LocalDateTime;

public class MedicationTreatment extends Treatment {
    private String medicine ;
    private int quantity;

    @Override
    public void printSchedule() {
        printDateAndName();
        System.out.printf("\n[Medication] - Medicine: %s, Quantity: %s",medicine,quantity);
    }

    public MedicationTreatment(){};
    public MedicationTreatment(LocalDateTime treatmentStartDate, Patient patient, int duration, String medicine, int quantity) {
        super(treatmentStartDate, patient, duration);
        this.medicine = medicine;
        this.quantity = quantity;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
