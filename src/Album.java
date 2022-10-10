import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private LinkedList<Song> songsList;
    private ArrayList<Album> albumList;

    public Album(LinkedList<Song> songsList, ArrayList<Album> albumList, String albumName, String songName) {
        this.songsList = new LinkedList<>();
        this.albumList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addAlbum(String albumName)
    {
        Album albumFound = findAlbum(albumName);
        return false;
    }


}
