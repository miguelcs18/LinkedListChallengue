import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private LinkedList<Song> songsList;
    private ArrayList<Album> albumList;


    public Album(String name) {
        this.name = name;
        this.songsList = new LinkedList<>();

    }

    public Album() {
        this.albumList = new ArrayList<>();
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
            return true;
        }
        System.out.println("Album  " + albumFound.getName() + " already exists and could not be added!");
        return false;
    }

    public boolean addSong(Song song, String albumName)
    {
        Album foundAlbum = findAlbum(albumName);
        if(foundAlbum != null)
        {
            foundAlbum.songsList.add(song);
            return true;
        }
        return false;
    }

    private Album findAlbum(String albumName)
    {
        Album foundAlbum;
        for(int i=0; i<albumList.size(); i++ )
        {
            foundAlbum = albumList.get(i);
            if(foundAlbum.getName().equals(albumName))
            {
                return foundAlbum;
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

    public void printAlumSongs(String albumName)
    {
        Album foundAlbum = findAlbum(albumName);
        if(foundAlbum != null)
        {
            System.out.println("Album " + foundAlbum.getName() + " has the next songs ");
            for(int i=0; i< foundAlbum.songsList.size(); i++)
            {
                System.out.println("songList["+ i +"] = " + songsList.get(i).getTitle());
            }
        }
    }
}
