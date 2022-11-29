package ZadaniaWlasneZaawansowane.Wyjątki.Zadanie2BookRepository;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String yearOfRelease;


    public Book(String isbn, String title, String author, String yearOfRelease) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(String yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfRelease='" + yearOfRelease + '\'' +
                "}";
    }
}
