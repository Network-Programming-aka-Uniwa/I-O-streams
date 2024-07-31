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

public class PrintWriterExample {
    public static void main(String [] args)
    {
	try
        {
           FileWriter  fwriter      = new FileWriter("data.txt");
           PrintWriter printWriter = new PrintWriter(fwriter);

           printWriter.print(true);
	   char [] s = {' ','h','e','l','l','o','\n'};
	   printWriter.print(s);
           printWriter.print((int) 123);
	   printWriter.println((double)45.67);
           printWriter.println((float) 123.456);
	   printWriter.println("This is a test");
           printWriter.close();
	}
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
