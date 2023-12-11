import java.util.List;


public class PatientManager {
    Patient patient = new Patient();
    private List<Integer> ID;
    private List<String> Name;
    private List<Integer> Age;
    private List<String> medCod;

    public void add(List<Integer> ID, List<String> Name, List<Integer> Age, List<String> medCod, int id, String name, int age, String medicals) {
        ID.add(id);
        Name.add(name);
        Age.add(age);
        medCod.add(medicals);
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
        this.medCod = medCod;
    }

    public String remove(List<Integer> ID, List<String> Name, List<Integer> age, List<String> medCod, int check) {
        int i = 0;
        String success = "";
        while (i < ID.size()) {
            if (ID.get(i) == check) {
                this.ID.remove(i);
                this.Name.remove(i);
                this.Age.remove(i);
                this.medCod.remove(i);
                success = "Patient removed successfully.";
                return success;
            } else {
                i++;
            }
        }
        success = "Patient not found.";
        return success;
    }

    public String view(int id) {
        int i = 0;
        String details = "";
        String success = "";
        while (i < ID.size()) {
            if (ID.get(i) == id) {
                details = String.format("""
                        Patient ID: %d
                        Patient Name: %s
                        Patient Age: %d
                        Patient Medical %s
                        """, this.ID.get(i), this.Name.get(i), this.Age.get(i), this.medCod.get(i));
                return details;
            } else {
                i++;
            }
        }
        success = "Patient not found.";
        return success;
    }

    public void update(int id, String name, int age, String medicals) {
        int i = 0;
        while (i < ID.size()) {
            if (ID.get(i) == id) {
                this.Name.set(i, name);
                this.Age.set(i, age);
                this.medCod.set(i, medicals);
            } else {
                i++;
            }
        }
    }

    public String check(int id) {
        int i = 0;
        String failure = "";
        if ((ID == null || ID.isEmpty())) {
            failure = "Patient not found.";
            return failure;
        }
        while (i < ID.size()) {
            if (ID.get(i) == id) {
                return "";
            } else {
                i++;
            }
        }
        for (int find:ID){
            if(find==id){
                failure="ID already exists try again.";
                return failure;
            }
        }
        failure = "Patient not found.";
        return failure;
    }



    public List<Integer> setID(){
        return this.ID;
    }
    public List<String> setName(){

        return this.Name;
    }
    public List<Integer> setAge(){
        return this.Age;
    }
    public List<String> setMedCod(){
        return this.medCod;
    }
    // add a collection of patients

}
