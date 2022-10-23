package DrugiTrener.Dzien1.abstractClass;

public class Snake extends Animal {
    public Snake(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("ssssssss");
    }
    @Override
    public int getLimbsAmount(){
        return 0;
    }
}
