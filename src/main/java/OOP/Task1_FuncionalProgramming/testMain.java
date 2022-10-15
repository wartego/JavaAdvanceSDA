package OOP.Task1_FuncionalProgramming;

import java.util.ArrayList;
import java.util.List;

public class testMain {

    public static void main(String[] args) {
        List<Season> shelf = new ArrayList<>();
    }

    private void allEpisodes(List<Season> shelf) {

    }

    private void allMovies(List<Season> shelf) {
        shelf.forEach(season ->
                season.episodes.forEach(episode ->
                        episode.videos.forEach(video ->
                                System.out.println(video.title))));
    }
    private void allSeasonName(List<Season> shelf) {
        shelf.forEach(season -> System.out.println(season.seasonName));
    }
    private void allSeasonNumbers(List<Season> shelf) {
        shelf.forEach(season -> System.out.println(season.seasonNumber));
    }

    private void allEpisodesName(List<Season> shelf){
        shelf.forEach(season -> season.episodes.forEach(episode -> System.out.println(episode.episodeName)));
    }

    private void oddSeason(List<Season> shelf){
        shelf.stream().filter(season -> season.seasonNumber%2==0).forEach(season -> System.out.println(season.episodes));
    }
}
