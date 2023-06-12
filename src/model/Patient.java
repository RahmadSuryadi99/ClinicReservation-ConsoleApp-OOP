package model;

import helper.Formater;
import helper.Validation;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Patient {
    private String id;
    private String name;
    private List<ChronicDisease> Disease;
    private LocalDate birthDate;
    public Patient(String id, String name, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }
    public Patient(){
        
    }

    public List<ChronicDisease> getDisease() {
        return Disease;
    }

    public void setDisease(List<ChronicDisease> disease) {
        Disease = disease;
    }

    public int getAge(){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


}
