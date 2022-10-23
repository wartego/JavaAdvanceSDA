package DrugiTrener.Dzien1.abstractClass;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }
    public abstract void makeSound();
    public abstract int getLimbsAmount();

    public String getName(){
        return name;
    }
}
