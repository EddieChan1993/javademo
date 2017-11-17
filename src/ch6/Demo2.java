package ch6;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

/**
 * "."和"|"都是转义字符，必须在前面加上"\\"
 */
public class Demo2 {
    ArrayList<String> songList = new ArrayList<String>();

    public static void main(String[] args) {
        new Demo2().go();
    }

    private void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);//调用Collection静态的sort然后再列出清单，第二次的输出会依照字母排序
        System.out.println(songList);
    }

    void getSongs() {
        File file = new File("SongList.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void addSong(String lineToParse) {

        String[] tokens = lineToParse.split("\\.");
        songList.add(tokens[0]);
    }
}