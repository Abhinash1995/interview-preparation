package com.company.inheritance;

public interface Remote {

    void switchOn();

//    static void switchOff(){
//        System.out.println("switch off in remote");
//    }

    default void switchOff(){
        System.out.println("switch off in remote");
    }
}
