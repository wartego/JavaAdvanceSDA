package DrugiTrener.Dzien2.PrzykladoweZadania.Runner;

public enum Runner {
    BEGINNER(1, 10),
    INTERMEDIATE(11, 20),
    ADVANCED(21, Integer.MAX_VALUE),
    WRONG_TIME(0, 0);


    private int minTime;
    private int maxTime;

    Runner(int minTime, int maxTime) {
        this.minTime = minTime;
        this.maxTime = maxTime;
    }

    public static Runner getFitnessLevel(int time) {

        Runner[] runners = Runner.values();
        for (Runner runner : runners) {
            if (time > runner.minTime && time <= runner.maxTime) {
                return runner;
            }
        }
        throw new IllegalArgumentException("Value of of range");
    }

//        if (BEGINNER.minTime <= time && time <= BEGINNER.maxTime) {
//            return BEGINNER;
//        } else if (INTERMEDIATE.minTime <= time && time <= INTERMEDIATE.maxTime) {
//            return INTERMEDIATE;
//        } else if (ADVANCED.minTime <= time && time <= ADVANCED.maxTime) {
//            return ADVANCED;
//        } else
//        throw new IllegalArgumentException("Value of of range");
//        }

}
