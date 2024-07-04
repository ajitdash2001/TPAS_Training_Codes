package OOPS;

import java.util.ArrayList;
import java.util.Random;


public class MusicLibrary{
    private ArrayList<Song> songs;
    private Random random;

    public MusicLibrary() {
        songs = new ArrayList<>();
        random = new Random();
    }

    public void addSong(String title, String artist) {
        songs.add(new Song(title, artist));
    }

    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equalsIgnoreCase(title));
    }

    public void playRandomSong() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
        } else {
            int randomIndex = random.nextInt(songs.size());
            Song randomSong = songs.get(randomIndex);
            System.out.println("Playing: " + randomSong);
        }
    }

    public void listSongs() {
        if (songs.isEmpty()) {
            System.out.println("No songs in the library.");
        } else {
            System.out.println("Songs in the library:");
            for (Song song : songs) {
                System.out.println(song);
            }
        }
    }
}

