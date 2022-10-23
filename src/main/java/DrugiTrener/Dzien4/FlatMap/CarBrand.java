package DrugiTrener.Dzien4.FlatMap;

import java.util.List;

public class CarBrand {
    private String name;
    private List<String> model;

    public CarBrand(String name, List<String> model) {
        this.name = name;
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getModel() {
        return model;
    }

    public void setModel(List<String> model) {
        this.model = model;
    }
}
