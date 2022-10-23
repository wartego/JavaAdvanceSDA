package DrugiTrener.Dzien1.abstractClass;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("Hau hau");
    }
    @Override
    public int getLimbsAmount(){
        return 4;
    }
}

