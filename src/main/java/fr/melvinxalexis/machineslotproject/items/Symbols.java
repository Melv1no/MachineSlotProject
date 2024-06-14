package fr.melvinxalexis.machineslotproject.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public enum Symbols {
    SYMBOL_1("/symbols/Symbol_1.png",2,1,4, 1.0 / 16),
    SYMBOL_2("/symbols/Symbol_2.png",5,4,2, 1.0 / 12),
    SYMBOL_3("/symbols/Symbol_3.png",5,4,2, 1.0 / 8),
    SYMBOL_4("/symbols/Symbol_4.png",5,4,2, 1.0 / 6),
    SYMBOL_5("/symbols/Symbol_5.png",5,4,2, 1.0 / 5),
    SYMBOL_6("/symbols/Symbol_6.png",5,4,2, 1.0 / 4),
    SYMBOL_7("/symbols/Symbol_7.png",5,4,2, 1.0 / 3),
    SYMBOL_8("/symbols/Symbol_8.png",5,4,2, 1.0 / 3),
    SYMBOL_9("/symbols/Symbol_9.png",5,4,2, 1.0 / 3);


    private final String imagePath;
    private final int multiplier5;
    private final int multiplier4;
    private final int multiplier3;
    private final double frequency;

    Symbols(String imagePath, int multiplier5,int multiplier4, int multiplier3,double frequency) {
        this.imagePath = imagePath;
        this.multiplier5 = multiplier5;
        this.multiplier4 = multiplier4;
        this.multiplier3 = multiplier3;
        this.frequency = frequency;
    }


    public String getImagePath() {
        return imagePath;
    }
    public int getMultiplier(int mutliplier) {
        switch(mutliplier){
            case 5:
                return multiplier5;
            case 4:
                return multiplier4;
            case 3:
                return multiplier3;
            default:
                return 0;
        }
    }
    public double getFrequency() {
        return frequency;
    }
}

