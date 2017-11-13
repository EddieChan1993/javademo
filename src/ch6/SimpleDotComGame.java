package ch6;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2017-11-13.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum1 = (int) (Math.random() * 10);
        int randomNum2 = (int) (Math.random() * 10);
        int randomNum3 = (int) (Math.random() * 10);

        ArrayList<String> locations=new ArrayList<String>(){{
            add(Integer.toString(randomNum1));
            add(Integer.toString(randomNum2));
            add(Integer.toString(randomNum3));
        }};

        theDotCom.setLocaltionCells(locations);

        while (true) {
            String guess = helper.getUserInput("输入你要猜的数:");
            String result = theDotCom.checkYourself(guess);

            numOfGuesses++;
            if (result.equals("kill")) {
                System.out.println("你于第" + numOfGuesses + "次猜中");
                break;
            }//close if
        }//close while
    }//close main
}