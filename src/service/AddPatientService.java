package service;

import data.ClinicHorusData;
import helper.Formater;
import model.ChronicDisease;
import model.Patient;

import java.util.List;

public class AddPatientService {
    public static void add(Patient dataPatient) {
        if (ClinicHorusData.patients.containsKey(dataPatient.getId())) {
            ClinicHorusData.patients.replace(dataPatient.getId(), dataPatient);
        } else {
            ClinicHorusData.patients.put(dataPatient.getId(), dataPatient);
        }
    }

    public static void printPatient() {
        if (!ClinicHorusData.patients.isEmpty()) {
            for (Patient patient : ClinicHorusData.patients.values()) {
                System.out.printf("ID:%s, Name: %s, Birth Date: %s, Age: %s\n", patient.getId(), patient.getName(), Formater.dateFormatIndo(patient.getBirthDate()), patient.getAge());
                printDisease(patient);
                System.out.println("=".repeat(60));
            }
        } else {
            System.out.println("Tidak ada patients");
        }
    }

    public static void printDisease(Patient patient) {
        if (patient.getDisease() != null) {
            for (ChronicDisease chronicDisease : patient.getDisease())
                System.out.printf("name: %s, Description %s\n", chronicDisease.getDiseaseName(), chronicDisease.getDescription());
        }
    }
}
