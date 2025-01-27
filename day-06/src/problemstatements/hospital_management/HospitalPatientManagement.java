package problemstatements.hospital_management;
import java.util.ArrayList;
import java.util.List;
public class HospitalPatientManagement {
    public static void main(String[] args) {
        // Creating a list of patients
        List<Patient> patients = new ArrayList<>();

        // Adding an InPatient
        InPatient inPatient = new InPatient(1, "Alice", 30, 2000, 5);
        inPatient.addRecord("Admitted for surgery.");
        inPatient.addRecord("Recovery in progress.");
        patients.add(inPatient);

        // Adding an OutPatient
        OutPatient outPatient = new OutPatient(2, "Bob", 45, 500);
        outPatient.addRecord("Consulted for flu symptoms.");
        patients.add(outPatient);

        // Processing and displaying patient details
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill: " + patient.calculateBill());

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                System.out.println("Medical Records: " + record.viewRecords());
            }

            System.out.println("---------------------------");
        }
    }
}
