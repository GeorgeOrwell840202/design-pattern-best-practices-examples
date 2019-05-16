package com.na.singleton;

public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;


    static {
        try {
            instance = new StaticBlockSingleton();
            System.out.println("StaticBlockSingleton init");
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    private StaticBlockSingleton() {
        System.out.println("ppzz");
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("StaticBlockSingleton");
    }
}