
public class ExceptionApp {

	public static void main(String[] args) {
		
		int[] scores = {10, 20, 30};		
		System.out.println(1);
		try {			
//			System.out.println(scores[3]);
			System.out.println(2/0);
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println(3);
	}	

}
