package resto;

public class DisplayItem {

	public static void displayItems() {
		String[] item = Items.getItem();
		int[] price = Price.getPrice();

		for (int i = 0; i < item.length; i++) {
			System.out.println(i+1+". "+item[i]+"           Price:"+price[i]);
		}
	}

}
