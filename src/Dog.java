public class Dog {
    private String name;
    private int age;
    private char gender;

    public Dog(){}

    public Dog(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String showInfo(){
        return String.format("""
                        Dog:
                        Name: %s
                        Age: %d
                        Gender: %s
                        """, name, age, gender);
    }
}
