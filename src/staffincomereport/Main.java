package staffincomereport;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String name;
		String id;
		String incomeType;
		double amount;
		double tax;
		double totalTax;
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Masukan Nama : ");
		name = sc.nextLine();
			
		System.out.println("Masukan Id : ");
		id = sc.nextLine();
			
		System.out.println("Masukan Income Type : ");
		incomeType = sc.nextLine();
		
		System.out.println("Amount atau Gaji : ");
		amount = sc.nextDouble();
		
		System.out.println("Pajak");
		tax = sc.nextDouble();
		
		double TotalTax = Income.totalTax (tax,amount);
		System.out.println("Total Tax : " + TotalTax);
		
		double NetIncome = Income.CalculateNetIncome(amount, TotalTax);
		System.out.println("Net Income : " + NetIncome);
		
	}

}

