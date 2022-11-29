package ZadaniaWlasneZaawansowane.ToDoList;

import java.util.ArrayList;
import java.util.List;

public class ToDoListRunner {
    public static void main(String[] args) {
ToDoList toDoList = new ToDoList();

        List<String> commands = new ArrayList<>();
        commands.add("new;TASK 1;2022-10-10;4");
        commands.add("new;TASK 2;2022-10-10;2");
        commands.add("new;TASK 3;2022-03-05;5");
        commands.add("new;TASK 4;2022-03-05;7");
        commands.add("new;TASK 5;2022-04-05;1");
        commands.add("new;TASK 6;2022-10-10;4");
        commands.add("readAll");
        commands.add("edit;TASK 5;2022-02-01;1");
        commands.add("countDeadLine");


        for (String command: commands) {
            String[] jobs = command.split(";");
            String action = jobs[0];
            switch (action){
                case "new" -> toDoList.add(jobs);
                case "edit" -> toDoList.edit(jobs);
                case "readAll" -> toDoList.readAll();
                case "countDeadLine" -> toDoList.countDeadLine();
            }

        }


    }
}
