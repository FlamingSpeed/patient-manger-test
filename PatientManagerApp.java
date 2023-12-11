import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PatientManagerApp {
    public static void main(String[] args) {
        Patient patient=new Patient();
        PatientManager manager = new PatientManager();
        Scanner scanner = new Scanner(System.in);
        int option=0;
        List<Integer> id = new ArrayList<Integer>();
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<String> medCod = new ArrayList<String>();
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
                        Patient ID: """);
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

                if(manager.check(patientID)=="ID already exists try again.") {
                    System.out.println(manager.check(patientID));
                }else{
                    System.out.println("Patient Added Succesfully\n");
                    manager.add(id, name, age, medCod, patientID, patientName, patientAge, patientMedicalCondition);
                }
            } else if (option==2) {
                System.out.print("\nEnter Patient ID to remove:");
                int removeOption = scanner.nextInt();
                System.out.println(manager.remove(id,name,age,medCod,removeOption));
            } else if (option==3) {
                System.out.print("\nEnter Patient ID:");
                int viewOption = scanner.nextInt();
                String check=manager.check(viewOption);
                System.out.println(check);
                if(!(check=="Patient not found.")) {
                    System.out.println(manager.view(viewOption));
                }
            } else if (option==4){
                System.out.print("\nEnter Patient ID:");
                int updateOption = scanner.nextInt();
                String check=manager.check(updateOption);
                System.out.println(check);
                if(!(check=="Patient not found.")) {
                    System.out.print("Patient Name:");
                    Scanner scanner1 = new Scanner(System.in);
                    String patientName = scanner1.nextLine();

                    System.out.print("Patient Age:");
                    int patientAge = scanner.nextInt();

                    System.out.print("Patient Medical Condition:");
                    String patientMedicalCondition = scanner1.nextLine();

                    manager.update(updateOption, patientName, patientAge, patientMedicalCondition);
                }
            }else if(option==6){
                System.out.println("Welcome to the secret test system.");
                System.out.println("ID list"+id);
                System.out.println("Name list"+name);
                System.out.println("Age list"+age);
                System.out.println("Medical Condition list"+medCod);
            }
        }System.out.println("Thank you for using the Patient Management System. Goodbye!");

    }
}
