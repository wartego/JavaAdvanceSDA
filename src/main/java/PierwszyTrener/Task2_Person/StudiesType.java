package PierwszyTrener.Task2_Person;

import lombok.Getter;

@Getter
enum StudiesType {
    LICENCJAT(1.5f, 2000),
    INZYNIERKA(3.5f, 3000),
    MAGISTERKA(4f, 4000),
    PODYPLOMOWE(2f, 9000),
    DOKTORAT(10f, 10000);
    private final float duration;
    private final int totalCost;

   StudiesType(float duration, int totalCost) {
        this.duration = duration;
        this.totalCost = totalCost;
    }
    boolean suficiantBudget(float budget){
       return getTotalCost() <= budget;
    }
}
