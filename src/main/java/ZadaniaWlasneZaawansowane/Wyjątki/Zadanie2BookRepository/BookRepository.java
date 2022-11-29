package ZadaniaWlasneZaawansowane.Wyjątki.Zadanie2BookRepository;

import java.util.ArrayList;
import java.util.List;

public class BookRepository {
    private List<Book> books =  new ArrayList<>();

    public void addObjectBook(Book book){
        this.books.add(book);
    }
    public void deleteObjectBook(String iban) throws NoBookFoundException{
        for (Book book:books){
            if (book.getIsbn().equals(iban)){
                books.remove(book);
                return;
            }
        }
        throw new NoBookFoundException("Can't delete book with isbn: " + iban);
    }


    public Book searchBookByTitle(String title) throws NoBookFoundException{
        for (Book book:books){
            if (book.getTitle().equals(title)){
                return book;
            }
        }
        throw new NoBookFoundException("Book with name not found: " + title);
    }

    public Book searchBookByID(String isbn) throws NoBookFoundException{
        for (Book book:books){
            if (book.getIsbn().equals(isbn)){
                return book;
            }
        }
        throw new NoBookFoundException("Book with title not found: " + isbn);
    }



    @Override
    public String toString() {
        return "BookRepository{" +
                "books=" + books +
                "}";
    }
}
