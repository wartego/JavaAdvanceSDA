package DrugiTrener.Dzien3.Dummy;

import java.util.Objects;

public class Dummy {
        private String name;
        private int value;

    public Dummy(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dummy dummy = (Dummy) o;
        return value == dummy.value && Objects.equals(name, dummy.name);
    }

    @Override
    public int hashCode() {
        System.out.println("HASHCODE is running");
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "Dummy{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}

