package ZadaniaWlasneZaawansowane.KlasyIInterfejsy.Zadanie2Movie;

public class Movie {
    private String title;
    private String director;
    private String releaseDate;
    private String genre;
    private String publisher;

    public Movie(String title, String director, String releaseDate, String genre, String publisher) {
        this.title = title;
        this.director = director;
        this.releaseDate = releaseDate;
        this.genre = genre;
        this.publisher = publisher;
    }


    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }

//////////////


   static class MovieCreator {
       private String title;
       private String director;
       private String releaseDate;
       private String genre;
       private String publisher;

       public MovieCreator setTitle(String title) {
           this.title = title;
           return this;
       }

       public MovieCreator setDirector(String director) {
           this.director = director;
           return this;
       }

       public MovieCreator setReleaseDate(String releaseDate) {
           this.releaseDate = releaseDate;
           return this;
       }

       public MovieCreator setGenre(String genre) {
           this.genre = genre;
           return this;
       }

       public MovieCreator setPublisher(String publisher) {
           this.publisher = publisher;
           return this;
       }

       public Movie createMovie(){
           Movie movie = new Movie(title,director,releaseDate,genre,publisher);
           return movie;
       }
   }
}
