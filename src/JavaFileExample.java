/* @author Nick Z. Zacharis */
import java.io.*;

public class JavaFileExample {

    public static void main(String[] args) {
       File fp = new File("D:\\jdk\\bin\\javac.exe");
       if(fp.exists() && fp.canExecute()){
          System.out.println(fp.getAbsolutePath() + " is executable");
       }
       
	   File folder = new File("D:\\jdk");
       String [] Contents = folder.list(); 
	   
	   for(String s : Contents) {
           System.out.println(s);
       }
      
	  fp = new File("D:\\jdk\\README.html"); 
	  fp.renameTo(new File ("D:\\jdk\\read.html")); 
	  fp.delete ();
   }
}