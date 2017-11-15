package ch9;

/**
 * Created by Administrator on 2017-11-15.
 */
public class MakeHippo {
    public static void main(String[] args) {
        Hippo h = new Hippo("Buffy");
        System.out.println(h.getName());

        Hippo h1 = new Hippo();
        System.out.println(h1.getName());
    }
}