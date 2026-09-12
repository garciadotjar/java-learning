package p13_innerClasses.domain;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    List<Video> videos = new ArrayList<>();

    public List<Video> filterByDuration(double duration) {
        List<Video> filteredVideos = new ArrayList<>();

        for (Video video : videos) {
            if (video.getDuration() >= duration) {
                filteredVideos.add(video);
            }
        }

        return filteredVideos;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "videos=" + videos +
                '}';
    }

    public void addToPlaylist(String title, double duration){
        videos.add(new Video(title, duration));
    }

        public double totalDuration(){
            double total = 0;
            for(Video i : videos){
                total += i.getDuration();
            }
            return total;
        }

        public double mediaDuration(){
            double total = 0;
            int quant = 0;
            for(Video i : videos){
                total += i.getDuration();
                quant++;
            }
            return total/quant;
        }

    public static class Video{

        private String title;
        private double duration;

        public Video(String title, double duration) {
            this.title = title;
            this.duration = duration;
        }

        @Override
        public String toString() {
            return "Video{" +
                    "title='" + title + '\'' +
                    ", duration=" + duration +
                    '}';
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }



    }

}
