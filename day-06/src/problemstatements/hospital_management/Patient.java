package problemstatements.hospital_management;

import java.util.*;

// Abstract class Patient
abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getter and Setter methods
    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }
}
