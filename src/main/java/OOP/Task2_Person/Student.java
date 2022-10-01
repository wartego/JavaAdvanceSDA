package OOP.Task2_Person;

class Student extends Person{
    private String type;
    private int year;
    private float cost;


    public Student(String name, String address, String type, int year, float cost) {
        super(name, address);
        this.type = type;
        this.year = year;
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
