import java.util.List;


public class PatientManager {
    Patient patient = new Patient();
    private List<Integer> ID;
    private List<String> Name;
    private List<Integer> Age;
    private List<String> medCod;
    private List<Double> Height;
    private List<Integer> Weight;
    private List<Integer> Contact;
    private List<String> Address;

    /**
     * This adds user input into the patient lists
     * @param ID list for ids
     * @param Name list for names
     * @param Age list for ages
     * @param medCod list for medical conditions
     * @param Height list for heights
     * @param Weight list for weights
     * @param Contact list for contacts
     * @param Address list for addresses
     * @param id user input to add
     * @param name user input to add
     * @param age user input to add
     * @param medicals user input to add
     * @param height user input to add
     * @param weight user input to add
     * @param contact user input to add
     * @param address user input to add
     * @return test to see if it is properly adding it
     */

    public String add(List<Integer> ID, List<String> Name, List<Integer> Age, List<String> medCod, List<Double> Height, List<Integer> Weight, List<Integer> Contact, List<String> Address, int id, String name, int age, String medicals, double height, int weight, int contact, String address) {
        ID.add(id);
        Name.add(name);
        Age.add(age);
        medCod.add(medicals);
        Height.add(height);
        Weight.add(weight);
        Contact.add(contact);
        Address.add(address);

        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
        this.medCod = medCod;
        this.Height=Height;
        this.Weight=Weight;
        this.Contact=Contact;
        this.Address=Address;

        String test=String.format("ID: %s, Name: %s, Age: %s, medCod: %s,Height: %s,Weight: %s,Contact: %s,Address: %s", this.ID,this.Name,this.Age,this.medCod,this.Height,this.Weight, this.Contact, this.Address );
        return test;
    }

    /**
     *Removes the patient information
     * @param ID the id list
     * @param check the id to check for in the id list
     * @return success to check if it is removed or not
     */
    public String remove(List<Integer> ID, int check) {
        int i = 0;
        String success = "";
        while (i < ID.size()) {
            if (ID.get(i) == check) {
                this.ID.remove(i);
                this.Name.remove(i);
                this.Age.remove(i);
                this.medCod.remove(i);
                this.Height.remove(i);
                this.Weight.remove(i);
                this.Contact.remove(i);
                this.Address.remove(i);
                success = "Patient Removed Successfully.";
                return success;
            } else {
                i++;
            }
        }
        success = "Patient not found.";
        return success;
    }

    /**
     *Enter an id to see the patients information
     * @param id the id you want to check the patient
     * @return success to check if it is removed or not
     */
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
                        Patient Height %f
                        Patient Weight %d
                        Patient Contact %d
                        Patient Address %s
                        """, this.ID.get(i), this.Name.get(i), this.Age.get(i), this.medCod.get(i),this.Height.get(i),this.Weight.get(i),this.Contact.get(i),this.Address.get(i));
                return details;
            } else {
                i++;
            }
        }
        success = "Patient not found.";
        return success;
    }

    /**
     *Updates any id
     * @param id user input to add
     * @param name user input to add
     * @param age user input to add
     * @param medicals user input to add
     * @param height user input to add
     * @param weight user input to add
     * @param contact user input to add
     * @param address user input to add
     * @return success says if it has been updated or not
     */
    public String update(int id, String name, int age, String medicals, double height, int weight, int contact, String address) {
        int i = 0;
        String success="Patient updated";
        while (i < ID.size()) {
            if (ID.get(i) == id) {
                this.Name.set(i, name);
                this.Age.set(i, age);
                this.medCod.set(i, medicals);
                this.Height.set(i, height);
                this.Weight.set(i, weight);
                this.Contact.set(i, contact);
                this.Address.set(i, address);
                return success;
            } else {
                i++;
            }
        }
        success="Patient not found";
        return success;
    }

    /**
     * Checks to see if the id exists
     * @param id the id used to check
     * @return failure tells if you have the id or don't
     */
    public String check(int id) {
        int i = 0;
        String failure = "";
        if ((ID == null || ID.isEmpty())) {
            failure = "Patient not found.";
            return failure;
        }
        while (i < ID.size()) {
            if (ID.get(i) == id) {
                return "ID already exists try again.";
            } else {
                i++;
            }
        }
        failure = "Patient not found.";
        return failure;
    }
}
