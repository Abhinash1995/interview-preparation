package com.company;

public class Abhi {

    public static void main(String[] args) {
        String[] colour = {"Blue", "Red", "Green", "Black"};//i
        Integer[] item = {1, 2, 3, 4, 5, 6, 7, 8,9,10};//j
        int i =0;
        for (int J = 0; J < item.length; J++) {
//            for (int i = 0; i < colour.length; i++) {
//                if((item.length%colour.length)==0)
//                System.out.println(item[J] + "-" + colour[i]);
//                J++;
//            }
//            J--;

            System.out.println(item[J] + "-" + colour[i]);
            i++;
            if(i==colour.length){
                i = 0;
            }
        }


    }
}
