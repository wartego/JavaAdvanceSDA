package ZadaniaWlasneZaawansowane.OOP.Zadanie2Person;

public class Staff extends Person{
    private String specialization;
    private String salary;

    public Staff(String specialization, String salary) {
        this.specialization = specialization;
        this.salary = salary;
    }

    public Staff(String name, String address, String specialization, String salary) {
        super(name, address);
        this.specialization = specialization;
        this.salary = salary;
    }


    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                " specialization='" + specialization + '\'' +
                ", salary='" + salary + '\'';
    }
}
