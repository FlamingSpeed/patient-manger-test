/**
 * This makes it so all patient information is organized
 */
public class Patient {
    private String name;
    private int age;
    private int id;
    private String medicalCondition;
    private double height;
    private int weight;
    private int contact;
    private String address;

    /**
     * gets infromation from getName to return
     * @return name
     */
    public String setName(){
        return name;
    }

    /**
     * gets infromation from the user on the name
     * @param name
     */
    public void getName(String name){
        this.name=name;
    }
    /**
     * gets infromation from getAge to return
     * @return age
     */
    public int setAge(){
        return age;
    }
    /**
     * gets infromation from the user on the age
     * @param age how old the patient is
     */
    public void getAge(int age){
        this.age=age;
    }
    /**
     * gets infromation from getID to return
     * @return id
     */
    public int setID(){
        return id;
    }
    /**
     * gets infromation from the user on the id
     * @param id the user id
     */
    public void getID(int id){
        this.id=id;
    }
    /**
     * gets infromation from getMedCod to return
     * @return medicalCondition
     */
    public String setMedCod(){
        return medicalCondition;
    }
    /**
     * gets infromation from the user on the medicalCondition
     * @param medicalCondition how the patient is
     */
    public void getMedCod(String medicalCondition){
        this.medicalCondition=medicalCondition;
    }
    /**
     * gets infromation from getHeight to return
     * @return height
     */
    public double setHeight(){
        return height;
    }
    /**
     * gets infromation from the user on the height
     * @param height the patients height
     */
    public void getHeight(double height){
        this.height=height;
    }
    /**
     * gets infromation from getWeight to return
     * @return weight
     */
    public int setWeight(){
        return weight;
    }
    /**
     * gets infromation from the user on the weight
     * @param weight the patient weight
     */
    public void getWeight(int weight){
        this.weight=weight;
    }
    /**
     * gets infromation from getContact to return
     * @return contact
     */
    public int setContact(){
        return contact;
    }
    /**
     * gets infromation from the user on the contact
     * @param contact the number to contact them
     */
    public void getContact(int contact){
        this.contact=contact;
    }
    /**
     * gets infromation from getAddress to return
     * @return address
     */
    public String setAddress(){
        return address;
    }
    /**
     * gets infromation from the user on the address
     * @param address this is the users address there are living in
     */
    public void getAddress(String address){
        this.address=address;
    }
}