import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private LinkedList<Song> songsList;
    private ArrayList<Album> albumList;


    public Album(String name) {
        this.name = name;
    }

    public Album() {
    }

    public String getName() {
        return name;
    }

    public boolean addAlbum(String albumName)
    {
        Album albumFound = findAlbum(albumName);
        if (albumFound == null)
        {
            this.albumList.add(new Album(albumName));
        }
        return false;
    }

    private Album findAlbum(String albumName)
    {

        for(int i=0; i<albumList.size(); i++ )
        {
            if(albumList.get(i).getName().equals(albumName))
            {
                return albumList.get(i);
            }
        }
        return null;
    }

    public void printAlbums()
    {
        for(int i=0; i<albumList.size(); i++)
        {
            System.out.println("Album[" + i + "] = " + albumList.get(i).getName());
        }

    }

}
