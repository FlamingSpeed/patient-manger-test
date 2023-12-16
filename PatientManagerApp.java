import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PatientManagerApp {
    public static void main(String[] args) {
        Patient patient;
        patient=new Patient();
        PatientManager manager = new PatientManager();
        Scanner scanner = new Scanner(System.in);
        int option=0;
        List<Integer> id = new ArrayList<>();
        List<String> name = new ArrayList<>();
        List<Integer> age = new ArrayList<>();
        List<String> medCod = new ArrayList<>();
        List<Double> height = new ArrayList<>();
        List<Integer> weight = new ArrayList<>();
        List<Integer> contact = new ArrayList<>();
        List<String> address = new ArrayList<>();
        System.out.print("Welcome to the Patient Management System!\n");
        while(option!=5) {
            System.out.print("""  
                        
                    Please select an option:
                    1. Add a new patient
                    2. Remove a patient
                    3. View patient details
                    4. Update patient information
                    5. Exit
                            
                    Your choice:""");
            option = scanner.nextInt();  // Read user input
            if (option == 1) {
                System.out.print("""
                        \nPlease enter patient details:
                        Patient ID:""");
                int patientID = scanner.nextInt();
                patient.getID(patientID);


                System.out.print("Patient Name:");
                Scanner scanner1 = new Scanner(System.in);
                String patientName = scanner1.nextLine();
                patient.getName(patientName);


                System.out.print("Patient Age:");
                int patientAge = scanner.nextInt();
                patient.getAge(patientAge);


                System.out.print("Patient Medical Condition:");
                String patientMedicalCondition = scanner1.nextLine();
                patient.getMedCod(patientMedicalCondition);

                System.out.print("Patient Height in ft:");
                double patientHeight = scanner.nextDouble();
                patient.getHeight(patientHeight);

                System.out.print("Patient Weight in pounds:");
                int patientWeight = scanner.nextInt();
                patient.getWeight(patientWeight);

                System.out.print("Patient Contact Number(Example 1111111111):");
                int patientContact = scanner.nextInt();
                patient.getContact(patientContact);


                System.out.print("Patient Address:");
                String patientAddress = scanner1.nextLine();
                patient.getAddress(patientAddress);

                if(Objects.equals(manager.check(patientID), "ID already exists try again.")) {
                    System.out.println(manager.check(patientID));
                }else{
                    System.out.println("Patient Added Successfully\n");
                    manager.add(id, name, age, medCod, height, weight, contact, address, patientID, patientName, patientAge, patientMedicalCondition, patientHeight,patientWeight,patientContact,patientAddress);
                }
            } else if (option==2) {
                System.out.print("\nEnter Patient ID to remove:");
                int removeOption = scanner.nextInt();
                if(Objects.equals(manager.check(removeOption), "ID already exists try again.")) {
                    System.out.println("Patient Removed Successfully\n");
                    System.out.println(manager.remove(id, removeOption));
                }else{
                    System.out.println("ID does not exist. Please try it again.");
                }
            } else if (option==3) {
                System.out.print("\nEnter Patient ID:");
                int viewOption = scanner.nextInt();
                String check=manager.check(viewOption);
                System.out.println(check);
                if(!(Objects.equals(check, "Patient not found."))) {
                    System.out.println(manager.view(viewOption));
                }else{
                    System.out.println(check);
                }
            } else if (option==4){
                System.out.print("\nEnter Patient ID:");
                int updateOption = scanner.nextInt();
                String check=manager.check(updateOption);
                System.out.println(check);
                if(!(Objects.equals(check, "Patient not found."))) {
                    System.out.print("Patient Name:");
                    Scanner scanner1 = new Scanner(System.in);
                    String patientName = scanner1.nextLine();

                    System.out.print("Patient Age:");
                    int patientAge = scanner.nextInt();

                    System.out.print("Patient Medical Condition:");
                    String patientMedicalCondition = scanner1.nextLine();

                    System.out.print("Patient Height:");
                    int patientHeight = scanner.nextInt();

                    System.out.print("Patient Weight:");
                    int patientWeight = scanner.nextInt();

                    System.out.print("Patient Contact:");
                    int patientContact = scanner.nextInt();

                    System.out.print("Patient Address:");
                    String patientAddress = scanner1.nextLine();

                    manager.update(updateOption, patientName, patientAge, patientMedicalCondition,patientHeight,patientWeight,patientContact,patientAddress);
                }else{
                    System.out.println(check);
                }
            }else if(option==6){
                System.out.println("Welcome to the secret test system.");
                System.out.println("ID list"+id);
                System.out.println("Name list"+name);
                System.out.println("Age list"+age);
                System.out.println("Medical Condition list"+medCod);
                System.out.println("Height list"+height);
                System.out.println("Weight list"+weight);
                System.out.println("Contact list"+contact);
                System.out.println("Address list"+address);


            }
        }System.out.println("Thank you for using the Patient Management System. Goodbye!");

    }
}
