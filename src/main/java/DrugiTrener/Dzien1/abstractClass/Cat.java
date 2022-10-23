package DrugiTrener.Dzien1.abstractClass;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeSound(){
        System.out.println("Miau miau");
    }
    @Override
    public int getLimbsAmount(){
        return 4;
    }
}
