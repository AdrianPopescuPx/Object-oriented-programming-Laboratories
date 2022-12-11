package lab5.task4;

import java.util.ArrayList;

public abstract class Album {
    ArrayList<Song> allSongs = new ArrayList<>();

    public abstract void addSong(Song song);

    public void removeSong(Song song) {
        this.allSongs.remove(song);
    }

    @Override
    public String toString() {
        return "Album{" +
                "allSongs=" + allSongs +
                '}';
    }
}
