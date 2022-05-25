package entities;

public class Dog extends Animal {

    public Dog(String name, String age) {
        super(name, age);
    }

    public void woof() {
        System.out.println("Dog " + super.getName() + " says woof! Dog is " + super.getAge() + " years old)");
    }

}
