package staffincomereport;

public class Income {

	private String incomeType;
	private double amount;
	private double tax;
	private double totalTax;
	
	Income (String incomeType, double amount, double tax, double totalTax, double calculateNetIncome ) {
		this.incomeType = incomeType;
		this.amount	= amount;
		this.tax = tax;
		this.totalTax = totalTax;	
	}

	public Income() {
		// TODO Auto-generated constructor stub
	}

	public String getIncomeType() {
		return incomeType;
	}

	public void setIncomeType(String incomeType) {
		this.incomeType = incomeType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public static double totalTax (double tax, double amount) {
		return tax/100 * amount;
	}
	public static double CalculateNetIncome (double amount, double totalTax) {
		return amount - totalTax;
		
	}
}
	