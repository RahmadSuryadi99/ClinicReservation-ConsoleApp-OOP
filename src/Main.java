import data.ClinicHorusData;
import helper.Formater;
import model.Patient;
import service.Initialization;
import view.MainMenu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Initialization.initTreatments();
        MainMenu.getInstance().run();

//        LocalDateTime startTreatment = LocalDateTime.of(2003,1,1,10,0);
//        LocalDateTime endTreatment = LocalDateTime.of(2003,1,1,10,10);
//        NavigableMap<LocalDateTime, Treatment> navigableMap = new TreeMap<>();
//        startTreatment.plusMinutes(10);
//        navigableMap.put(startTreatment.plusMinutes(10), null);
//        navigableMap.put(startTreatment.minusMinutes(10), null);
//        System.out.println(navigableMap.lowerEntry(startTreatment));
//        navigableMap.get(navigableMap.lowerEntry(startTreatment)).getEndTreatment();
//
//        System.out.println(navigableMap.higherEntry(startTreatment));

    }
}
