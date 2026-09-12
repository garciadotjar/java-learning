//09-12-26
//simple inner classes test
package p13_innerClasses;

import p13_innerClasses.domain.Playlist;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addToPlaylist("Marcelo is dumb", 2.5);
        playlist.addToPlaylist("Rafael doesn't know english", 5);
        playlist.addToPlaylist("Marcelo thinks he knows better than me, but he's wrong", 8);
        playlist.addToPlaylist("Yeeeeeey", 7);

        List<Playlist.Video> min = playlist.filterByDuration(5);
        System.out.println(playlist);
        System.out.println("------------------");
        System.out.println(min);
    }
}
