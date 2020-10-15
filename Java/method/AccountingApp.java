
public class AccountingApp {
	
	public static double valueOfSupply;
	public static double vatRate;
	
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
	
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	

	public static void main(String[] args) {
		//공급가
		AccountingApp.valueOfSupply = 10000.0;
		
		//부가가치세율
		AccountingApp.vatRate = 0.1;
		//부가세
		double vat = AccountingApp.getVAT();
		//합계
		double total = AccountingApp.getTotal();
		
		System.out.println("VAT: " + AccountingApp.getVAT());
		System.out.println("TOTAL: " + AccountingApp.getTotal());
	}

}
