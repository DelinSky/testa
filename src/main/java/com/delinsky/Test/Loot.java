package com.delinsky.Test;

/**
 * Created by Vladimir on 01.04.2017.
 */
public class Loot {
    public int counter = 0;
    public int itemCode;
    public boolean firstItemFound;
    public boolean secondItemFound;

    public void gotOrNot() {
        firstItemFound = false;
        secondItemFound = false;
        for (int i = 0; i < 3; i++) {
            itemCode = (int) (100*(Math.random()));
            if (itemCode > 0 & itemCode < 5 ) {
                firstItemFound = true;
            }
            if (itemCode > 5 & itemCode < 10 ) {
                secondItemFound = true;
            }
        }
        if (firstItemFound && secondItemFound) {
            counter++;
        }
    }
}
