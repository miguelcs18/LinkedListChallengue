import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private LinkedList<Song> songsList;
    private ArrayList<Album> albumList;

    public Album(LinkedList<Song> songsList, ArrayList<Album> albumList, String albumName, String songName) {
        this.songsList = new LinkedList<>();
        this.albumList = new ArrayList<>();
    }




}
