import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PatientTest {


    @Test
    public void testGetID() {
        Patient patient;
        patient = new Patient();
        int ID = 1234;
        patient.getID(ID);
        Assertions.assertEquals(1234, patient.setID());
    }

    @Test
    public void testGetName() {
        Patient patient = new Patient();
        String name = "Kevin";
        patient.getName(name);
        Assertions.assertEquals("Kevin", patient.setName());
    }

    @Test
    public void testGetHeight() {
        Patient patient = new Patient();
        double height = 6.02;
        patient.getHeight(height);
        Assertions.assertEquals(6.02, patient.setHeight());

    }

    @Test
    public void testGetWeight() {
        Patient patient = new Patient();
        int weight = 140;
        patient.getWeight(weight);
        Assertions.assertEquals(140, patient.setWeight());
    }

    @Test
    public void testMedicalCondition() {
        Patient patient = new Patient();
        String medicalCondition = "Sick";
        patient.getMedCod(medicalCondition);
        Assertions.assertEquals("Sick", patient.setMedCod());
    }

    @Test
    public void testGetAge() {
        Patient patient = new Patient();
        int age = 15;
        patient.getAge(age);
        Assertions.assertEquals(15, patient.setAge());
    }
    @Test
    public void testGetContact() {
        Patient patient = new Patient();
        int contact = 1111111111;
        patient.getContact(contact);
        Assertions.assertEquals(1111111111, patient.setContact());
    }
    @Test
    public void testGetAddress() {
        Patient patient = new Patient();
        String address = "1111 West Banana Road";
        patient.getAddress(address);
        Assertions.assertEquals("1111 West Banana Road", patient.setAddress());
    }



    // Test constructor(s) and all getters and setters
}