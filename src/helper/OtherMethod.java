package helper;

import data.ClinicHorusData;

import java.time.LocalDateTime;

public class OtherMethod {
    public static LocalDateTime getTreatmentEndDateTime(LocalDateTime startDate,int duration){
        return startDate.plusMinutes(duration);
    };
    public static void printListTreatment() {
        ClinicHorusData.treatments.forEach((key, value) -> {
            System.out.println("Code: " + key + ", Name: " + value);
        });
    }
}
