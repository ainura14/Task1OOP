//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 2, 'M');
        System.out.println(cat.showInfo());

        Cat cat1 = new Cat("Mursik", 4, 'F');
        System.out.println(cat1.showInfo());

        Cat cat2 = new Cat("Simba", 1, 'M');
        System.out.println(cat2.showInfo());

        System.out.println("------------------------------------");

        Dog dog = new Dog("Bobik", 1, 'M');
        System.out.println(dog.showInfo());

        Dog dog1 = new Dog("Reks", 4, 'M');
        System.out.println(dog1.showInfo());

        Dog dog2 = new Dog("Tobi", 2, 'F');
        System.out.println(dog2.showInfo());
    }
}