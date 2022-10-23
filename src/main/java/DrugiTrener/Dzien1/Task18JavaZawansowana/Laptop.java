package DrugiTrener.Dzien1.Task18JavaZawansowana;

public class Laptop extends Computer {
    private String battery;

    public Laptop(String processor, String ram, String graphicCard, String manufacture, String model, String battery) {
        super(processor, ram, graphicCard, manufacture, model);
        this.battery = battery;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    @Override
    public String toString() {
        return super.toString() + ", battery: " + battery;
    }
}