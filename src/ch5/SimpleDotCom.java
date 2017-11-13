package ch5;

/**
 * Created by Administrator on 2017-11-13.
 */
public class SimpleDotCom {
    int[] localtionCells;//本地方格
    int numOfHits = 0;//击中次数

    public void setLocaltionCells(int[] localtionCells) {
        this.localtionCells = localtionCells;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for (int cell : localtionCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == localtionCells.length) {
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}