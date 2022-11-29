package ZadaniaWlasneZaawansowane.KlasyIInterfejsy.Zadanie2Movie;

public class main {
    public static void main(String[] args) {
        Movie movie = new Movie.MovieCreator().setTitle("Janko").setDirector("Kubica").setGenre("Action").setReleaseDate("2022").setPublisher("FrankoPublish").createMovie();
        System.out.println(movie);
    }
}
