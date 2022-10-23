package DrugiTrener.Dzien1;

public class Engine {
    private int capacity;
    private int cylinder;

    public Engine(int capacity, int cylinder) {
        this.capacity = capacity;
        this.cylinder = cylinder;
    }
public void run(){
    System.out.println("Engine is running.");
}
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }
}
