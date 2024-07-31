/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nzacharis
 */
import java.io.*;

public class BufferedReaderExample {
    public static void main(String [] args)
    {
       System.out.println("Read contents line by line");
       
       try
       {
          FileReader fr = new FileReader("source.txt");
          BufferedReader bufferedReader = new BufferedReader(fr);  
          String line;
          while((line = bufferedReader.readLine()) != null) {
              System.out.println(line);
          }
       }
       catch(Exception ex){
           System.out.println("Error : " + ex.getMessage());
      }
      
       System.out.println("Read contents as char array");
       try{
          FileReader fr = new FileReader("source.txt");
          BufferedReader bufferedReader = new BufferedReader(fr);  
          char [] line = new char[1024];
          while((bufferedReader.read(line,0,line.length)) != -1) {
              System.out.println(line);
          }
       }
       catch(Exception ex){
           System.out.println("Error : " + ex.getMessage());
    }
     System.out.println("Read contents char by char");       
       try{
          FileReader fr = new FileReader("source.txt");
          BufferedReader bufferedReader = new BufferedReader(fr);  
          int ch ;
          while((ch = bufferedReader.read()) != -1) {
              System.out.print((char)ch);
          }
       }
       catch(Exception ex){
           System.out.println("Error : " + ex.getMessage());
    }
} }
