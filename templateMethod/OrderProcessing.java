package templateMethod;


public abstract class OrderProcessing {
	abstract boolean selectItem();
	abstract void doPayment();
	abstract void doDelivery();
	public final void process() {
		ItemList i=new ItemList();
		i.displayItems();
		boolean b=selectItem();
		if(b) {
			doPayment();
			doDelivery();
		}
		else {
			System.out.println("item not found");
		}
	}
}
