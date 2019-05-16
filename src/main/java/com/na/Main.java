package com.na;

import com.na.singleton.EagerInitializedSingleton;
import com.na.singleton.StaticBlockSingleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------");
        EagerInitializedSingleton.getInstance().print();
        EagerInitializedSingleton.getInstance().print();
        EagerInitializedSingleton.getInstance().print();


        StaticBlockSingleton.getInstance().print();
        StaticBlockSingleton.getInstance().print();
        StaticBlockSingleton.getInstance().print();
        StaticBlockSingleton.getInstance().print();


    }
}
