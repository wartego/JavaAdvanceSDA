package OOP.Task4_List;

import java.util.*;

public class Zadanie3_List_Set_DuplicatedValues {
    public static void main(String[] args) {

        List<Integer> randomNumbersList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 5000; i++) {
            randomNumbersList.add(random.nextInt(5000001));
        }

        Set<Integer> setTable = new HashSet<>();
        Set<Integer> duplicatedValues = new HashSet<>();



//Print duplicated values
        for(Integer tempValue: randomNumbersList){
            if(setTable.contains(tempValue)){
              duplicatedValues.add(tempValue);
            } else {
                setTable.add(tempValue);
            }
        }
        setTable.removeAll(duplicatedValues); // usuwanie duplikatow z tabelki setTable na podstawie zduplikowanych wartosci

        System.out.println("Unique values: " + setTable + " --> Table size: " + setTable.size());

        System.out.println("Dupliacted values " + duplicatedValues + " --> table size: " + duplicatedValues.size());


    }
}
