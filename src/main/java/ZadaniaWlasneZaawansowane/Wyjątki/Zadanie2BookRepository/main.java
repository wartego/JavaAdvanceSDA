package ZadaniaWlasneZaawansowane.Wyjątki.Zadanie2BookRepository;

public class main {
    public static void main(String[] args) throws NoBookFoundException {
        BookRepository bookRepository =new BookRepository();

        bookRepository.addObjectBook(new Book("gsdaad-3422","Pan Tadeusz","Mickiewicz","2004"));
        bookRepository.addObjectBook(new Book("aad-234c","Potop","Gajewski","2009"));
        bookRepository.addObjectBook(new Book("fsd-2sdc","Lalka","Modrzejewska","2022"));
        //bookRepository.deleteObjectBook("aad-234d");
        System.out.println(bookRepository);


        System.out.println("");
        System.out.println((bookRepository.searchBookByTitle("Pan Tadeusz")));
        try {
            System.out.println((bookRepository.searchBookByID("fsd-2sdc")));
        } catch (NoBookFoundException e){
            System.out.println("Not found");
            e.printStackTrace();
        }
    }
}
