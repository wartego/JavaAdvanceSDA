package ZadaniaWlasneZaawansowane.ToDoList;

import java.time.LocalDate;

public class Item {
    private String name;
    private LocalDate deadline;
    private int priority;

    public Item(String name, LocalDate deadline, int priority) {
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return String.format("NAME: %s DEADLINE: %s PRIORITY: %d\n" , name,deadline,priority );
    }
}
