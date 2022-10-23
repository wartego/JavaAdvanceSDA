package PierwszyTrener.Task2_Person;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
//@AllArgsConstructor
    class Staff extends Person{
        private String specialization;
        private float salary;

    public Staff(String name, String address, String specialization, float salary) {
        super(name, address);
        this.specialization = specialization;
        setSalary(salary);
        this.salary = salary;
    }
public void setSalary(float salary){
    if (salary <= 0){
        throw new IllegalArgumentException("Not acceptable salary!!!");
    }
    this.salary = salary;
}
    @Override
    public String toString() {
        return String.format("Student: %s\nspecialization: %s\nsalary: %.2f",
                super.toString(),
                specialization,
                salary);

    }
}
