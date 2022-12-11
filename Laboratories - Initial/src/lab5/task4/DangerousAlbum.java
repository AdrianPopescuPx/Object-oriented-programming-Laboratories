package lab5.task4;

public class DangerousAlbum extends Album{


    public void addSong(Song song) {
        boolean ok = true;
        if(song.id == 1) {
            ok = false;
        }
        else if(song.id == 2) {
            ok = true;
        }
        else {
            for(int d = 2; d * d <= song.id; ++d) {
                if(song.id % d == 0) {
                    ok = false;
                    break;
                }
            }
        }
        if(ok) {
            allSongs.add(song);
        }
        else {
            System.out.println("Error: Song " + song.name + " doesn't have a prime id!");
        }
    }
}
