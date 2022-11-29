package ZadaniaWlasneZaawansowane.Wyjątki.Zadanie1NewException;

public class CannotDivideBy0Exception extends Exception{
    public CannotDivideBy0Exception(final int b){
        super(String.format("CannotDivideBy0Exception - please check argument b: = " + b ));
    }
}
