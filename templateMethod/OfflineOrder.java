package templateMethod;

import java.util.Scanner;

public class OfflineOrder extends OrderProcessing{
	ItemList i;
	String name;
	Scanner sc=new Scanner(System.in);
	public OfflineOrder(){
		i=new ItemList();
	}
	@Override
	boolean selectItem() {
		System.out.println("Enter item");
		name=sc.next();
		return i.search(name);
	}
	@Override
	void doPayment() {
		System.out.println("Enter quantity");
		int qty=sc.nextInt();
		float val=i.calculatePrice(name,qty);
		System.out.println(" At counter,Please pay "+val);
	}
	@Override
	void doDelivery() {
		System.out.println("Collect Items at Counter");
	}

}
