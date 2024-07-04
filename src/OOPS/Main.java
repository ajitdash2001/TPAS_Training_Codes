package OOPS;

public class Main {
    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

        library.addSong("Bohemian Rhapsody", "Queen");
        library.addSong("Imagine", "John Lennon");
        library.addSong("Hotel California", "Eagles");

        System.out.println("After adding songs:");
        library.listSongs();

        library.playRandomSong();

        library.removeSong("Imagine");

        System.out.println("\nAfter removing a song:");
        library.listSongs();

        library.playRandomSong();
}
}
