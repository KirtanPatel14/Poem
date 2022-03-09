package com.company;

public class PoemTester {
    public static void main(String[] args) {
        System.out.println("Poem");

        Poem p1 = new Poem(12);
        System.out.println(p1.getNumlines());
        p1.printRhythm();

        System.out.println();
        System.out.println("Haiku");
        System.out.println();
        Haiku h1 = new Haiku();
        System.out.println(h1.getNumlines());
        System.out.println(h1.getSyllables(2));
        h1.printRhythm();

        System.out.println();
        System.out.println("limerick");
        System.out.println();
        Limerick lim1 = new Limerick();
        System.out.println(lim1.getNumlines());
        System.out.println(lim1.getSyllables(2));
        System.out.println(lim1.getSyllables(4));
        lim1.printRhythm();

    }
}
