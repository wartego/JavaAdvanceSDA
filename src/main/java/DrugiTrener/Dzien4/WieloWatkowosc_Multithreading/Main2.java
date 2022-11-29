package DrugiTrener.Dzien4.WieloWatkowosc_Multithreading;

public class Main2 {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        Thread t1 = new Thread(counterThread1);
        Thread t2 = new Thread(counterThread2);
        t1.setName("t1");
        t2.setName("t2");
                t1.start();
                t2.start();
        t1.join();
        t2.join();




        System.out.println(Thread.currentThread().getName() + "Final result: " + counter.getValue());
    }
}

