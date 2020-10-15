interface Calculable{
	double PI = 3.14;
	int sum(int v1, int v2);
}

interface Printable{
	void print();
}
class RealCal implements Calculable, Printable{
	
	@Override
	public int sum(int v1, int v2) {
		return v1+v2;
	}

	@Override
	public void print() {
		System.out.println("This is RealCal!!");
	}
	
}

class AdvancedPrint implements Printable{
	public void print() {
		System.out.println("This is RealCal!!");
	}
}

//class DummyCal implements Calculable{
//	public int sum(int v1, int v2) {
//		return v1+v2;
//	}
//}
public class interfaceApp {

	public static void main(String[] args) {
		RealCal c = new RealCal();
		System.out.println(c.sum(2, 1));
		c.print();
		System.out.println(c.PI);
		
//		Calculable c = new RealCal();
//		System.out.println(c.sum(2, 1));
//		c.print();
//		System.out.println(c.PI);
//		
//		Printable c = new RealCal();
//		System.out.println(c.sum(2, 1));
//		c.print();
//		System.out.println(c.PI);
		
		Printable c1 = new AdvancedPrint();
//		System.out.println(c1.sum(2, 1));
		c1.print();
//		System.out.println(c1.PI);
	}

}
