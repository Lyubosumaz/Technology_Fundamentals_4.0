package Order_by_Age_P07;

public class PersonID {
    private String name;
    private String numberID;
    private int age;

    public PersonID(String name, String numberID, int age) {
        this.name = name;
        this.numberID = numberID;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getNumberID() {
        return numberID;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.getName(), this.getNumberID(), this.getAge());
    }
}
