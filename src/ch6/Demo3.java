package ch6;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Administrator on 2017-11-17.
 */
public class Demo3 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Demo3().go();
    }

    private void go() {
        getSongs();

    }

    public void getSongs() {
        File file = new File("SongList.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            try {
                while ((line = reader.readLine()) != null) {
                    addSong(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("\\.");
        Song nextSong = new Song(tokens[0], tokens[1]);
        songList.add(nextSong);
    }
}