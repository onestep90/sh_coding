
public class AuthApp {

	public static void main(String[] args) {
		System.out.println(args[0]);
		String id = "onestep";
		String inputId = args[0];
		
		String password = args[1];
		
		System.out.println("HI. ");
		
		if(inputId == id) {
			System.out.println("Mater!");
		} else {
			System.out.println("Who are you");
		}
		
		if(inputId.equals(id)) {
			System.out.println("Mater!");
		} else {
			System.out.println("Who are you");
		}
		
		if(inputId.equals(id)) {
			System.out.println("Mater!");
		} else {
			System.out.println("Who are you");
		}
	}

}
