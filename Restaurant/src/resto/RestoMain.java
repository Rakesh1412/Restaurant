package resto;

public class RestoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayItem.displayItems();
		int bill=Customer.takeOrder();
		System.out.println("your total bill Amount is "+bill);

	}

}
