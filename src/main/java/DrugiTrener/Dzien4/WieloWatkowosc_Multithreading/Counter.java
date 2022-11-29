package DrugiTrener.Dzien4.WieloWatkowosc_Multithreading;

public class Counter {
    private int value = 0;
    public void up(){
        value++;
        System.out.println(Thread.currentThread().getName() + ": " + value);
    }
    public void down(){
        value--;
        System.out.println(value);
    }
    public int getValue(){
        return value;
    }
}
