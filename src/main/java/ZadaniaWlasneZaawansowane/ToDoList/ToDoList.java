package ZadaniaWlasneZaawansowane.ToDoList;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToDoList {

    List<Item> itemList = new ArrayList<>();

    public void add(String[] jobs) {
        Item item = createNewItem(jobs);
        itemList.add(item);
        System.out.println("Dodano task: " + item.getName());
    }
    private Item createNewItem(String[] arg) {
        return new Item(arg[1], LocalDate.parse(arg[2]),Integer.parseInt(arg[3]));
    }

    public void edit(String[] jobs) {
        Item item = createNewItem(jobs);
        int index = findIndex(item);
        if(index<0){
            System.out.println("Nie znaleziono takiego zadania o nazwie" + jobs[1]);
        } else{
            System.out.println("Edytowano task: " + jobs[1]);
            itemList.add(index,item);
        }

    }

    public int findIndex(Item item) {
        int counterIndex = 0;
        for(Item itemlist: itemList){
            if(item.getName().equals(itemlist.getName())) {
            return counterIndex;
        } else {
                counterIndex++;
            }
        }
       return -1;
    }


    public void readAll() {
        System.out.println("Wszystkie zadania:  ");
        itemList.forEach(System.out::print);
    }

    public void countDeadLine() {
        Map<LocalDate,Integer> map = new HashMap<>();
        itemList.forEach( s-> {
            if(!map.containsKey(s.getDeadline())) {
                map.put(s.getDeadline(), 1);
        } else{
                map.put(s.getDeadline(), map.get(s.getDeadline())+1);
            }
        });
        map.forEach((k,v)-> System.out.printf("DEADLINE: %s, COUNT: %s\n",k,v));
    }
}
