package OOP.Task1_FuncionalProgramming;

import java.util.List;
class Episode {
        public String episodeName;
        public int episodeNumber;
        List<Video> videos;
        public Episode(String episodeName, int episodeNumber,
                       List<Video> videos) {
            this.episodeName = episodeName;
            this.episodeNumber = episodeNumber;
            this.videos = videos;
        }
    }