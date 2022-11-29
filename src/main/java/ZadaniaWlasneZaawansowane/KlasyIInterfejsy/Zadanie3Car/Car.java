package ZadaniaWlasneZaawansowane.KlasyIInterfejsy.Zadanie3Car;

public class Car {
    private String name;
    private String carType;
    private Engine engine; //obiekt Engine

    public Car(String name, String carType) {
        this.name = name;
        this.carType = carType;
        engine = new Car.Engine();
        engine.setEngineType(carType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carType='" + carType + '\'' +
                ", engine=" + engine +
                '}';
    }

    class Engine {
        private String engineType;

        public void setEngineType(String carType) {
            if (carType.equals("economy")) {
                engineType = "diesel";
            } else if (carType.equals("luxury")) {
                engineType = "electric";
            } else {
                engineType = "petrol";
            }
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "engineType='" + engineType + '\'' +
                    '}';
        }
    }


}

