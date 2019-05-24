package templateMethod;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemList {
	float price;
	String name;
	ArrayList<ItemList> al=new ArrayList<ItemList>();
	ItemList(String name,float price){
		this.name=name;
		this.price=price;
	}
	String getName() {
		return name;
	}
	float getPrice() {
		return price;
	}
	ItemList(){
		al.add(new ItemList("football",300));
		al.add(new ItemList("bat",800));
		al.add(new ItemList("ball",60));
		al.add(new ItemList("helmet",1500));
		al.add(new ItemList("shoe",2000));
	}
	void addItem() {
		Scanner sc=new Scanner(System.in);
		System.out.println("If you want to add item in the store press \"y\"");
		String str=sc.next();
		while(str.equals("y")) {
			System.out.println("enter name of the item");
			name=sc.next();
			System.out.println("enter price");
			price=sc.nextFloat();
			al.add(new ItemList(name,price));
			System.out.println("If you want to add again \"y\"");
		}
	}
	boolean search(String str) {
		for(ItemList il:al) {
			if(il.getName().equals(str)){
				return true;
			}
		}
		return false;
	}
	float calculatePrice(String str,int qty) {
		for(ItemList il:al) {
			if(il.getName().equals(str)) {
				return il.price*qty;
			}
		}
		return 0;
	}
	void displayItems() {
		for(ItemList il:al) {
			System.out.println("Item :"+il.name+" price :"+il.price);
		}
	}

}
