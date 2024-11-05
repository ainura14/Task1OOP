public class Cat {
    private String name;
    private int age;
    private char gender;

    public Cat(){}

    public Cat(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String showInfo(){
        return String.format("""
                        Cat:
                        Name: %s
                        Age: %d
                        Gender: %s
                        """, name, age, gender);
    }
}
