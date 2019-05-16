package com.na.singleton;



public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton() {
    }


    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public void print() {
        System.out.println("EagerInitializedSingleton");
    }
}