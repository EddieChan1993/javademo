package ch6;

/**
 * Created by Administrator on 2017-11-17.
 */
public class Song {
    String title;
    String rating;

    public Song(String title, String rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public String getRating() {
        return rating;
    }
}