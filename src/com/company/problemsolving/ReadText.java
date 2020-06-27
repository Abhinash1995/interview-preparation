package com.company.problemsolving;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadText {

    public static String readFileAsString(String fileName)throws Exception
    {
        String data = "";
        data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
    public static void main(String[] args) throws IOException {
        List<String> strings =  Files.readAllLines(Paths.get("/home/mmfpcdev1/Downloads/tavern-menu-items.txt"), StandardCharsets.UTF_8);
//        System.out.println(strings);
        String data = null;
        try {
            data = readFileAsString("/home/mmfpcdev1/Downloads/tavern-menu-items.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(data);
      String[]  datas = data.split("\n");
        System.out.println(datas);




    }
}
