public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");
        Album  albumTest = new Album();
        albumTest.addAlbum("Van Haleen");
        albumTest.addAlbum("Black Sabbath");
        Song song = new Song("Jump","05:05");
        Song song2 = new Song("Panama","06:55");
        Song song3 = new Song("Paranoid","04:05");
        Song song4 = new Song("Dark","07:03");

        boolean songAdded =  albumTest.addSong(song,"Van Haleen");
        System.out.println("Song added = " + songAdded);

        songAdded = albumTest.addSong(song2,"Van Haleen");
        System.out.println("Song added = " + songAdded);

        songAdded = albumTest.addSong(song3,"Black Sabbath");
        System.out.println("Song added = " + songAdded);

        songAdded = albumTest.addSong(song4,"Black Sabbath");
        System.out.println("Song added = " + songAdded);

        albumTest.printAlbums();
        albumTest.printAlbumSongs("Van Haleen");
        albumTest.printAlbumSongs("Black Sabbath");
    }

}
