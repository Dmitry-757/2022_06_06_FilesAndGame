package org.dng;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ReadWrite {

    public static void writeToDisk(String str){
        try(BufferedWriter bwriter = new BufferedWriter(new FileWriter("GameDat.txt", true)))
        {
            bwriter.write(str);
            bwriter.append('\n');
            bwriter.flush(); //очищает буфер вывода
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static List<String> readFromDisk(){
        List<String> stringsOfFile = new LinkedList<>();
        try(BufferedReader breader = new BufferedReader(new FileReader(Main.getFileName()))) {
//            String str;
//            while ((str = breader.readLine())!=null){
//                //some action
//                stringsOfFile.add(str);
//            }
            stringsOfFile = breader.lines().toList();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringsOfFile;
    }
}
