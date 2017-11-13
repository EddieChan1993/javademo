package ch5;

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

        int[] locations = {randomNum1, randomNum2, randomNum3};

        System.out.println("当前的数为"+ Arrays.toString(locations));

        theDotCom.setLocaltionCells(locations);
        boolean isAlive = true;

        while (isAlive == true) {
            String guess = helper.getUserInput("输入你要猜的数:");
            String result = theDotCom.checkYourself(guess);

            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("你于第"+numOfGuesses+"次猜中");
            }//close if
        }//close while
    }//close main
}