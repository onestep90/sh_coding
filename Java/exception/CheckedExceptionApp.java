import java.io.FileWriter;
import java.io.IOException;

public class CheckedExceptionApp {
	// try catch finally
	public static void main(String[] args) {
		FileWriter f = null;
		try {
			f = new FileWriter("data.txt");
			f.write("Hello");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(f != null) {
				try {
					f.close();
				}catch(IOException e){
					e.printStackTrace();
				}
				
			}
			
		}
		
	}

}
