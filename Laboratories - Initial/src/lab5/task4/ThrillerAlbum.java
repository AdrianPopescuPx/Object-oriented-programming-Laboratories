package lab5.task4;

public class ThrillerAlbum extends Album{
    public void addSong(Song song) {
        if(song.composer == "Michael Jackson" && song.id % 2 == 0) {
            allSongs.add(song);
        }
        else {
            System.out.println("Error: cannot add " + song.name + " to our list!");
        }
    }
}
