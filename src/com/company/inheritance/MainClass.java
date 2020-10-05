package com.company.inheritance;

public class MainClass extends Board implements Remote{

    @Override
    public void switchOn() {
        System.out.println("Remote is On");
    }
    
    public static void main(String[] args) {
        MainClass mainClass = new MainClass();
        mainClass.switchOn();
        mainClass.switchOff();
    }
}
