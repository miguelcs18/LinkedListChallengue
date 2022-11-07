import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

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

        LinkedList<Song> myPlaylist = new LinkedList<>();
        albumTest.addSongToPlayList(myPlaylist,"Jump","Van Haleen");
        albumTest.addSongToPlayList(myPlaylist,"Paranoid","Black Sabbath");
        albumTest.addSongToPlayList(myPlaylist,"Panama","Van Haleen");
        albumTest.addSongToPlayList(myPlaylist,"Dark","Black Sabbath");

        for(int i = 0; i<myPlaylist.size(); i++)
        {
            System.out.println("My playlist = " + myPlaylist.get(i).getTitle());
        }

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<Song> listIterator = myPlaylist.listIterator();
        boolean goingForward = true;

        if(myPlaylist.isEmpty())
        {
            System.out.println("No songs in playlist");
        }
        else
        {
            System.out.println("Now playing Song:" + listIterator.next().getTitle());
        }

        while(!quit)
        {
            System.out.println("Choose option...");
            int option = scanner.nextInt();
            switch(option)
            {
                case 1:
                    quit = true;
                    System.out.println("Quit program!");
                    break;
                case 2:
                    System.out.println("Skip forward to the next song!");
                    if(!goingForward)
                    {
                        if(listIterator.hasNext())
                        {
                            System.out.println("Song: " + listIterator.next().getTitle() );
                        }
                        goingForward = true;
                    }
                    if(listIterator.hasNext())
                    {
                        System.out.println("Song: " + listIterator.next().getTitle() );
                    }
                    else
                    {
                        System.out.println("You have reached the end of list");
                        goingForward = false;
                    }
                    break;
                case 3:
                    System.out.println("Skip backwards to a previous song");
                    if(goingForward)
                    {
                        if(listIterator.hasPrevious())
                        {
                            System.out.println("Song: " + listIterator.previous().getTitle() );
                        }
                        goingForward = false;
                    }
                    if(listIterator.hasPrevious())
                    {
                        System.out.println("Song:" + listIterator.previous().getTitle() );
                    }
                    else
                    {
                        System.out.println("You have reached the end of playlist");
                        goingForward = true;
                    }
                    break;
                case 4:
                    System.out.println("Replay the current song");
                    break;
                case 5:
                    System.out.println("List the songs in play list");
                    albumTest.printMyPlaylist(myPlaylist);
                    break;
                case 6:
                    System.out.println("Remove song from Play List");
                    listIterator.remove();
                    break;
                default:
                    System.out.println("Unknown option, try again to a valid option");
                    break;
            }
        }
    }

}
