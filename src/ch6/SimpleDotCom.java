package ch6;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017-11-13.
 */
public class SimpleDotCom {
    private ArrayList<String> localtionCells;

    public void setLocaltionCells(ArrayList<String> localtionCells) {
        this.localtionCells = localtionCells;
    }


    public String checkYourself(String userInput) {
        String result = "miss";

        int index = localtionCells.indexOf(userInput);

        if (index !=-1) {
            localtionCells.remove(index);
            if (localtionCells.isEmpty()) {
                result ="kill";

            }else{
                result = "hit";
            }
        }
        System.out.println(result);
        return result;
    }
}