import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ShowDefaultEnconding {

    public static void main(String [] args)
	{
          System.out.println(System.getProperty("file.encoding"));
	}
}
