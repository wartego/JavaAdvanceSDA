package DrugiTrener.Dzien1.Task18JavaZawansowana;

public class Computer {
    private String processor;
    private String ram;
    private String graphicCard;
    private String manufacture;
    private String model;

    public Computer(String processor, String ram, String graphicCard, String manufacture, String model) {
        this.processor = processor;
        this.ram = ram;
        this.graphicCard = graphicCard;
        this.manufacture = manufacture;
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicCard() {
        return graphicCard;
    }

    public void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicCard='" + graphicCard + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
