import java.util.ArrayList;
import java.util.Iterator;
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

    public boolean addSongToPlayList(LinkedList<Song> playList, String songName, String albumName)
    {
        Album foundAlbum = findAlbum(albumName);
        if(foundAlbum != null)
        {
            Song foundSong = findSong(songName, albumName);
            if(foundSong != null)
            {
                playList.add(foundSong);
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }

    private Song findSong(String songName, String albumName)
    {
        Album foundAlbum = findAlbum(albumName);
        if(foundAlbum != null)
        {
            System.out.println("Album found in find Song = " + foundAlbum.getName());
            System.out.println("The size of  " + foundAlbum.getName() + " is : " + foundAlbum.songsList.size());
           for(int i=0; i<foundAlbum.songsList.size(); i++)
            {
                for(int j=0; j<foundAlbum.songsList.size(); j++)
                {
                    Song foundSong =  foundAlbum.songsList.get(j);
                    if(foundSong.getTitle().equals(songName))
                    {
                        return  foundSong;
                    }
                }
            }
        }
        return null;
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

    public void printAlbumSongs(String albumName)
    {
        Album foundAlbum = findAlbum(albumName);
        if(foundAlbum != null)
        {
            System.out.println("songs in album " + foundAlbum.getName()  + " are:");
            Iterator<Song> i = foundAlbum.songsList.iterator();

            while(i.hasNext())
            {
                Song song  = i.next();
                System.out.println("Song :" + song.getTitle() + " duration: " + song.getDuration());
            }
        }
    }
}
