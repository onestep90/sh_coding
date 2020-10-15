import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
	// try with resource statements
	public static void main(String[] args) {
		try(FileWriter f = new FileWriter("data.txt")){
			f.write("Hello");
//			f.close();	
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
