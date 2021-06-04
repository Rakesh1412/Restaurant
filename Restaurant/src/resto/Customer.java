package resto;

import java.util.Scanner;

public class Customer {
	public static int takeOrder() {
		String no;
		int[] price=Price.getPrice();
		int totalAmount=0;
		int[] orders;
		Scanner s=new Scanner(System.in);
		do {
			System.out.println("please select the option to order food");
			int order=s.nextInt();
			totalAmount=totalAmount+price[order-1];
			System.out.println("would you like to order somthing else ?");
			no=s.next();
					
		}while(no.equalsIgnoreCase("yes"));
		
		return totalAmount;
	}

}
