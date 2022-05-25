import entities.Animal;
import entities.Cat;
import entities.Dog;

import java.util.ArrayList;
import java.util.List;

public class InstanceOfExample {

    public static void main(String[] args) {

        List<Animal> pets = new ArrayList<>();

        pets.add(new Cat("Murzik", "1"));
        pets.add(new Cat("Pushok", "2"));
        pets.add(new Dog("Belka", "1"));
        pets.add(new Dog("Strelka", "2"));

        pets.forEach(pet -> {
            if (pet instanceof Cat s) {
                s.meow();
            } else if (pet instanceof Dog d) {
                d.woof();
            }
        });
    }
}
