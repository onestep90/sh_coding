class Print{
	public String delimiter = "";
	public Print(String delimiter) {
		this.delimiter = delimiter; // this -> instance를 가리
	}
	public void A() {
		System.out.println(this.delimiter);
		System.out.println("A");
		System.out.println("A");
	}
	
	public void B() {
		System.out.println(this.delimiter);
		System.out.println("B");
		System.out.println("B");
	}

}
public class MyOOP {
	
	
	public static void main(String[] args) {
		Print p1 = new Print("----");
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print("****");
		p2.A();
		p2.A();
		p2.B();
		p2.B();
	}

	
}
