package DrugiTrener.Dzien4.Reflection;

public class Dummy {
    private  int value;
    private String name;
    public Dummy(String name){
        this.name = name;
    }

    public Dummy(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
