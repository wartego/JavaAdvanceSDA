package DrugiTrener.Dzien2.TypyGeneryczne;

public class Pair <V1,V2>{
    //to są generyki
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }


    public V1 getValue1(){ // metoda generyczna
        return value1; // zwracamy obiekt value1
    }
    public V2 getValue2(){
        return  value2;
    }



}
