package DrugiTrener.Dzien1.abstractClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Snake snake = new Snake("Pimpek");
        Animal snake = new Snake("Pimpek"); // tak tez mozna "polimofrizm" - czyli zaleznosc
        snake.makeSound();
        Animal dog = new Dog("Reksio");
        Animal cat = new Cat("Mruczek");

        List<Animal> list = new ArrayList<>();
        list.add(cat);
        list.add(dog);
        list.add(snake);
        System.out.println("ALl animals making sound");
        for (Animal animal : list
             ) {
            System.out.println(animal.getName() + ": ");
            animal.makeSound();

        }
        }
    }

