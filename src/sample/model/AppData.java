package sample.model;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.HashMap;

public class AppData {
    public static Employee loginBoy;
    public static Patient selectedPatient;
    public static ArrayList<Patient> patientArrayList = new ArrayList<>();
    public static HashMap<String,Medicines> MedNameHashMap = new HashMap<>();
    public static ArrayList<Employee> employees = new ArrayList<>();
    public static ArrayList<Bill> bills = new ArrayList<>();
    public static double amount;
    public static Bill bill;
    public static String caller;
    public static ObservableList<Label> notificationList = FXCollections.observableArrayList();;
    public static Medicines selectedMedicine;
    public static String pharmacist;
}