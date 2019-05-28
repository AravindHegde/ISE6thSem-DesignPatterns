package templateMethod;


public abstract class OrderProcessing {
	abstract boolean selectItem(ItemList i);
	abstract void doPayment(ItemList i);
	abstract void doDelivery();
	public final void process(ItemList i) {
		i.displayItems();
		boolean b=selectItem(i);
		if(b) {
			doPayment(i);
			doDelivery();
		}
		else {
			System.out.println("item not found");
		}
	}
}
