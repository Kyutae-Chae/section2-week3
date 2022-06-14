package com.codestates.chapter3.psa;

public class ChildManageApplication {
    public static void main(String[] args) {
        Child newBornBaby = new NewBornBaby();
        Child infant = new Infant();
        Child toddler = new Toddler();

        newBornBaby.sleep();
        infant.sleep();
        toddler.sleep();
    }
}
