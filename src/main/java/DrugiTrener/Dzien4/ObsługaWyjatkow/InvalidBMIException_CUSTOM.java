package DrugiTrener.Dzien4.ObsługaWyjatkow;

public class InvalidBMIException_CUSTOM extends RuntimeException /* lub Exception */{
    public InvalidBMIException_CUSTOM(){
        super("BMI must be betweeb 10 and 100");
    }
}
