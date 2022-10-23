package PierwszyTrener.Task2_Person;

class Student extends Person{
    private StudiesType type;
    private int year;
    private float cost;


    public Student(String name, String address, StudiesType type, int year, float cost) {
        super(name, address);

        studyValidator(year,type,cost);

        this.type = type;
        this.year = year;
        this.cost = cost;
    }

    private void studyValidator(int year, StudiesType type, float cost
    ){
        if(year <= 0){
            throw new IllegalArgumentException("Negative year!");
        }
        if (type.getDuration() <year){
            throw new IllegalArgumentException("Wieczny student - Overbound");
        }
        if (!type.suficiantBudget(this.cost)) {
            throw new RuntimeException("To low budget");
        }
    }

    public Student(String name, String address){
        super(name, address);
        this.type = StudiesType.MAGISTERKA;
        this.year = 1;
        this.cost = 0;

    }

    public StudiesType getType() {
        return type;
    }

    public void setType(StudiesType type) {
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

    @Override
    public String toString() {
        return String.format("Student: %s\ntype: %s\nyear: %d\ncost: %.2f",
                super.toString(),
                type,
                year,
                cost);
    }
}
