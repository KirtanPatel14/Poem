package com.company;

public class Limerick extends Poem {
    public Limerick() {
        super(5);
    }

    public int getSyllables(int k) {
        if (k == 1 || k == 2 || k == 5) {
            return 9;
        } else {
            return 6;
        }
    }

    public void printRhythm() {
        for (int i = 1; i <= getNumlines(); i++) {
            printTa(getSyllables(i));
            System.out.println("ta");
        }
        System.out.println();
    }
}