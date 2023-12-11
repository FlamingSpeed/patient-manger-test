public class Patient {
    private String name;
    private int age;
    private int id;
    private String medicalCondition;
    public String setName(){
        return name;
    }
    public void getName(String name){
        this.name=name;
    }
    public int setAge(){
        return age;
    }
    public void getAge(int age){
        this.age=age;
    }
    public int setID(){
        return id;
    }
    public void getID(int id){
        this.id=id;
    }
    public String setMedCod(){
        return medicalCondition;
    }
    public void getMedCod(String medicalCondition){
        this.medicalCondition=medicalCondition;
    }

}