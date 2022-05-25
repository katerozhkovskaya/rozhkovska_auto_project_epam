package entities;

public class Cat extends Animal {

    public Cat(String name, String age) {
        super(name, age);
    }

    public void meow() {
        System.out.println("Cat " + super.getName() + " says meow! Cat is " + super.getAge() + " years old)");
    }

}
