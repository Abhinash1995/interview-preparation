package com.company.inheritance;

public class Son extends Father{

    public void makeHome(){
        System.out.println("son is making hole");
    }

//    @Override
//    public void makeHome() {
//        super.makeHome();
//    }
    
    public static void main(String[] args) {
        Son son = new Son();
        son.makeHome();

    }
}
