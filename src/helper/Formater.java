package helper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formater {

    public static String dateFormatIndo(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }public static String dateFormatIndo(LocalDateTime date) {
        return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"));
    }
    public static LocalDate stringToDate(String dateString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", new Locale("id", "ID"));
        LocalDate date = LocalDate.parse(dateString, formatter);
            return date;
    }
    public static LocalDateTime stringToDate(String dateString, int duration){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm", new Locale("id", "ID"));
        LocalDateTime date = LocalDateTime.parse(dateString, formatter);
            return date;
    }


}
