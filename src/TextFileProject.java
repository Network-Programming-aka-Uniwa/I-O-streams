import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileProject {

    public static void main(String [] args)
	{
		try{
		(new TextFileProject()).CopyTextFiles();
		}catch(Exception ex) {}
	}
	
    void CopyTextFiles() throws IOException
    {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader ("source.txt");
            out = new FileWriter ("dest.txt");
            int c;

            while ((c = in.read()) != -1) {
	        System.out.println((char)c);
                out.write(c);
         }   } 
        catch(java.io.IOException ex)  {
            System.out.println("Error : " + ex.getMessage());
        }
        finally {
            if (in != null) {
                   in.close();
            }
            if (out != null) {
                out.close();
}  }   } }
