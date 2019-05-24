package templateMethod;

public class TemplateDemo {

	public static void main(String[] args) {
		ItemList i=new ItemList();
		i.displayItems();
		i.addItem();
		OnlineOrder or=new OnlineOrder();
		or.process();
		System.out.println();
		OfflineOrder of=new OfflineOrder();
		of.process();

	}

}
