package problemstatements.hospital_management;
import java.util.List;
import java.util.ArrayList;
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> medicalHistory;

    public OutPatient(int patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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
