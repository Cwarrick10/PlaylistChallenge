package io.zipcoder;
import java.util.HashMap;
public class Music {

    private String[] playList;

    public Music(String[] playList){

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        String selectUp = playList[startIndex];
        String seledtDown = playList[startIndex];
        int upIndex = startIndex;
        int downIndex = startIndex;
        int presses = 0;
        int lastIndex = this.playList.length - 1;

        while (!selectUp.equals(selection) && !seledtDown.equals(selection)) {
            upIndex = (upIndex == 0) ? lastIndex : upIndex - 1;
            downIndex = (downIndex == lastIndex) ? 0 : downIndex + 1;
            presses++;
            selectUp = playList[upIndex];
            seledtDown = playList[downIndex];
        }

        return presses;
    }
}
