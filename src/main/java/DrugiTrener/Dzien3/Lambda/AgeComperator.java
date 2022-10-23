package DrugiTrener.Dzien3.Lambda;

import java.util.Comparator;

public class AgeComperator implements Comparator<Person> {
    public int compare(Person p1, Person p2){
        if(p1.getAge() > p2.getAge()){
            return 1;
        } else if(p1.getAge() < p2.getAge()) {
            return -1;
        } else {
            return 0;
        }

    }
}
