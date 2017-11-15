package ch10;

/**
 * 每个Song对象都有自己的size变量，当所有Song实例只有一份duckCount变量
 * 所以他们是共享的
 * 冰淇淋：
 * 小明1和小明2一起吃一个冰淇淋
 */
public class TestSong {
    public static void main(String[] args) {
        Song song = new Song();
        System.out.println(song.duckCount);
        Song song1 = new Song();
        System.out.println(song.duckCount);
        System.out.println(song1.duckCount);
    }
}