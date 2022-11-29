package DrugiTrener.Dzien4.WieloWatkowosc_Multithreading;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterThread counterThread = new CounterThread(counter);
        Thread t1 = new Thread(counterThread);
        t1.setName("t1");
                t1.start();


        // Race condition - nie mamy wplywu na to ktory watek bedzie pierwszy
        //jak chcemy zmusic watek zeby poczekal na drugi, musimy na tym drugim z poziomu pierwszego wykonac jakas metoda join

     //   counterThread.run();


        //nowy wątek
//        Thread t1 = new Thread(counterThread);
//        t1.start();
//        t1.join();


        System.out.println(Thread.currentThread().getName() + "Final result: " + counter.getValue());
    }
}

