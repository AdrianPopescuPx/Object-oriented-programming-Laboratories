package lab5.task4;

public class BadAlbum extends Album{


    @Override
    public void addSong(Song song) {
        if(song.name.length() <= 3) {
            boolean ok = true;
            int number = song.id;
            int palindrom = 0;
            while(number != 0) {
                palindrom = (palindrom * 10) + number % 10;
                number /= 10;
            }
            if(palindrom != song.id) {
                System.out.println("Error: Song " + song.name + " doesn't have a palindrom id");
            }
            else {
                allSongs.add(song);
            }
        }
        else {
            System.out.println("Error: Song " + song.name + " doesn't have a name that consists of 3 letters");
        }
    }
}
