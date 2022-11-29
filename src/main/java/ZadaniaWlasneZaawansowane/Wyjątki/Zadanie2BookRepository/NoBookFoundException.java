package ZadaniaWlasneZaawansowane.Wyjątki.Zadanie2BookRepository;

public class NoBookFoundException extends Exception {
    public NoBookFoundException(String message){
       super(message);
    }
}
