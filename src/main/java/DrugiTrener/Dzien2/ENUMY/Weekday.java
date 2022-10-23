package DrugiTrener.Dzien2.ENUMY;

public enum Weekday {
MONDAY("PONIEDZIALEK"),
    TUESDAY("WTOREK"),
    WEDNESDAY("ŚRODA"),
    THURSDAY("CZWARTEK"),
    FRIDAY("PIĄTEK"),
    SATURDAY("SOBOTA"),
    SUNDAY("NIEDZIELA");

    // poniżej są atrybuty
    private  String polishName;
    Weekday(String polishName){
        this.polishName = polishName;
    }

    // metody ponizej
    public String getPolishName(){ //getter
        return polishName;
    }
}
