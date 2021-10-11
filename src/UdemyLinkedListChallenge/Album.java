package UdemyLinkedListChallenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Album {
    private String title, artist;
    private ArrayList<Song> songs;

    public Album(String title, String artist) {
        this.title = title;
        this.artist = artist;
//        initializes the ArrayList
        this.songs = new ArrayList<Song>();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public boolean addSong(String title, double duration){
//        check if song already exists, if not it is added
        if(findSong(title) == null){
//            creating a new instance of Song(passing title and duration) and adding it to the ArrayList songs
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
//        checks each Song inside the ArrayList songs
        for(Song checkedSong: this.songs){
//            if the title of the song being checked is equal to the title parameter being passed
            if(checkedSong.getTitle().equals(title)){
//                it returns the song to the function to add song
                return checkedSong;
            }
        }
//        otherwise, it returns null and no song is added
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList){
        int index = trackNumber - 1;
        if(index > 0 && index <= this.songs.size()){
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("this album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, List<Song> playList){
        Song checkSong = findSong(title);

        if(checkSong != null){
            playList.add(checkSong);
            return true;
        }
        System.out.println("The Song " + title + " is not in this album");
        return false;
    }


    @Override
    public String toString() {
        return "Album{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
