import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class PatientManagerTest {
    private PatientManager manager;
    List<Integer> ID = new ArrayList<>();
    List<String> Name = new ArrayList<>();
    List<Integer> Age = new ArrayList<>();
    List<String> medCod = new ArrayList<>();
    List<Double> Height = new ArrayList<>();
    List<Integer> Weight = new ArrayList<>();
    List<Integer> Contact = new ArrayList<>();
    List<String> Address = new ArrayList<>();
    @Test
    public void testAddPatientSuccess() {
        PatientManager manager=new PatientManager();
        int id=1234;
        String name="Kevin Siju Eappen";
        int age=15;
        String medicals="Sick";
        double height=6.01;
        int weight=140;
        int contact=1111111111;
        String address="1111 West Banana road";
        Assertions.assertEquals("ID: [1234], Name: [Kevin Siju Eappen], Age: [15], medCod: [Sick],Height: [6.01],Weight: [140],Contact: [1111111111],Address: [1111 West Banana road]",manager.add(ID,Name,Age,medCod,Height,Weight,Contact,Address,id, name, age, medicals, height, weight, contact,address));

    }

    @Test
    public void testAddDuplicatePatient() {
        PatientManager manager=new PatientManager();
        int id=1234;
        String name="Kevin Siju Eappen";
        int age=15;
        String medicals="Sick";
        double height=6.01;
        int weight=140;
        int contact=1111111111;
        String address="1111 West Banana road";
        System.out.print(manager.add(ID,Name,Age,medCod,Height,Weight,Contact,Address,id, name, age, medicals, height, weight, contact,address));
        Assertions.assertEquals("ID already exists try again.",manager.check(id));
    }
    @Test
    public void testRemove(){
        PatientManager manager=new PatientManager();
        int id=1234;
        String name="Kevin Siju Eappen";
        int age=15;
        String medicals="Sick";
        double height=6.01;
        int weight=140;
        int contact=1111111111;
        String address="1111 West Banana road";
        manager.add(ID,Name,Age,medCod,Height,Weight,Contact,Address,id, name, age, medicals, height, weight, contact,address);
        int checkID=1234;
        Assertions.assertEquals("Patient Removed Successfully.",manager.remove(ID,checkID));
    }
    @Test
    public void testRemoveDoesNotExist(){
        PatientManager manager=new PatientManager();
        Assertions.assertEquals("Patient not found.",manager.remove(ID,1111));

    }
    @Test
    public void testViewSuccess(){
        PatientManager manager=new PatientManager();
        int id=1234;
        String name="Kevin Siju Eappen";
        int age=15;
        String medicals="Sick";
        double height=6.01;
        int weight=140;
        int contact=1111111111;
        String address="1111 West Banana road";
        manager.add(ID,Name,Age,medCod,Height,Weight,Contact,Address,id, name, age, medicals, height, weight, contact,address);
        Assertions.assertEquals("Patient ID: 1234\n" +
                "Patient Name: Kevin Siju Eappen\n" +
                "Patient Age: 15\n" +
                "Patient Medical Sick\n" +
                "Patient Height 6.010000\n" +
                "Patient Weight 140\n" +
                "Patient Contact 1111111111\n" +
                "Patient Address 1111 West Banana road\n",manager.view(1234));
    }
    @Test
    public void testViewNotFound(){
        PatientManager manager=new PatientManager();
        int id=1234;
        String name="Kevin Siju Eappen";
        int age=15;
        String medicals="Sick";
        double height=6.01;
        int weight=140;
        int contact=1111111111;
        String address="1111 West Banana road";
        manager.add(ID,Name,Age,medCod,Height,Weight,Contact,Address,id, name, age, medicals, height, weight, contact,address);
        Assertions.assertEquals("Patient not found.",manager.view(1111));
    }
    @Test
    public void testUpdate(){
        PatientManager manager=new PatientManager();
        int id=1234;
        String name="Kevin Siju Eappen";
        int age=15;
        String medicals="Sick";
        double height=6.01;
        int weight=140;
        int contact=1111111111;
        String address="1111 West Banana road";
        manager.add(ID,Name,Age,medCod,Height,Weight,Contact,Address,id, name, age, medicals, height, weight, contact,address);
         name="Bob";
         age=12;
         medicals="Nothing";
         height=1.01;
         weight=10;
         contact=1112111111;
         address="1112 West Banana road";
        Assertions.assertEquals("Patient updated",manager.update(1234,name,age,medicals,height,weight,contact,address));
    }
    @Test
    public void testUpdateFail(){
        PatientManager manager=new PatientManager();
        int id=1234;
        String name="Kevin Siju Eappen";
        int age=15;
        String medicals="Sick";
        double height=6.01;
        int weight=140;
        int contact=1111111111;
        String address="1111 West Banana road";
        manager.add(ID,Name,Age,medCod,Height,Weight,Contact,Address,id, name, age, medicals, height, weight, contact,address);
        Assertions.assertEquals("Patient not found",manager.update(1111,name,age,medicals,height,weight,contact,address));
    }
    @Test
    public void testMultiple(){
        PatientManager manager=new PatientManager();
        int id=1234;
        String name="Kevin Siju Eappen";
        int age=15;
        String medicals="Sick";
        double height=6.01;
        int weight=140;
        int contact=1111111111;
        String address="1111 West Banana road";
        System.out.println(manager.add(ID,Name,Age,medCod,Height,Weight,Contact,Address,id, name, age, medicals, height, weight, contact,address));
        int id1=1111;
        String name1="Bob";
        int age1=30;
        String medicals1="Flu";
        double height1=16.01;
        int weight1=200;
        int contact1=1131111111;
        String address1="1112 West Banana road";
        System.out.println(manager.add(ID,Name,Age,medCod,Height,Weight,Contact,Address,id1, name1, age1, medicals1, height1, weight1, contact1,address1));
        manager.update(1111,"Bill",40,"Covid",1.01,600,1131111113,"1113 West Banana road");
        manager.remove(ID,1111);
    }
    @Test
    public void testCheckNotFound(){
        PatientManager manager=new PatientManager();
        Assertions.assertEquals("Patient not found.",manager.check(1111));
        int id=1234;
        String name="Kevin Siju Eappen";
        int age=15;
        String medicals="Sick";
        double height=6.01;
        int weight=140;
        int contact=1111111111;
        String address="1111 West Banana road";
        System.out.println(manager.add(ID,Name,Age,medCod,Height,Weight,Contact,Address,id, name, age, medicals, height, weight, contact,address));
        Assertions.assertEquals("Patient not found.",manager.check(1111));

    }
    // add the rest of your tests to get full coverage
}
