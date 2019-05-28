package templateMethod;

import java.util.Scanner;

public class OnlineOrder extends OrderProcessing{
	
	String name;
	Scanner sc=new Scanner(System.in);

	boolean selectItem(ItemList i) {
		System.out.println("Enter item");
		name=sc.next();
		return i.search(name);
	}
	@Override
	void doPayment(ItemList i) {
		System.out.println("Enter quantity");
		int qty=sc.nextInt();
		float val=i.calculatePrice(name,qty);
		System.out.println("pay online,Please pay "+val);
		
	}
	@Override
	void doDelivery() {
		System.out.println("Item will be deilivered to you");
	}

}
