package problemstatements.hospital_management;
import java.util.List;
import java.util.ArrayList;
class InPatient extends Patient implements MedicalRecord {
    private double roomCharge;
    private int daysAdmitted;
    private List<String> medicalHistory;

    public InPatient(int patientId, String name, int age, double roomCharge, int daysAdmitted) {
        super(patientId, name, age);
        this.roomCharge = roomCharge;
        this.daysAdmitted = daysAdmitted;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return roomCharge * daysAdmitted;
    }

    @Override
    public void addRecord(String record) {
        medicalHistory.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return new ArrayList<>(medicalHistory);
    }
}

