public class Main {
    public static void main(String[] args) {


        System.out.println("Hello World!");
        Album  albumTest = new Album();
        albumTest.addAlbum("Van Haleen");
        albumTest.addAlbum("Black Sabbath");
        Song song = new Song("Jump","5:05");

        boolean songAdded =  albumTest.addSong(song,"Van Haleen");
        System.out.println("Song added = " + songAdded);

        albumTest.printAlbums();
    }

}
