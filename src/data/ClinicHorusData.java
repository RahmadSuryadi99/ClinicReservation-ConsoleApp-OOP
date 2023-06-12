package data;

import model.Patient;
import model.Treatment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClinicHorusData {
    public final static Map<String, String> treatments = new HashMap<>();
    public final static Map<String, Patient> patients = new HashMap<>();
    public final static List<Treatment> treatmentSchedules = new ArrayList<>();
}
