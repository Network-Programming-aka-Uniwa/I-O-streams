import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinFileProject {
	
	public static void main(String [] args)
	{
		try{
		(new BinFileProject()).CopyBinaryFiles();
		}catch(Exception ex) {}
	}
	
    void CopyBinaryFiles() throws IOException
    {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.pdf");
            out = new FileOutputStream("output.pdf");
            int c;

            while ((c = in.read()) != -1) {
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
    }  }   }
}
