package adapter;

public class MauriTaxAdapter implements CalcTax {

	MauriTax mt=new MauriTax();
	@Override
	public float taxAmount(int qty, float price) {
		return mt.mauriTaxAmount(qty, price);
	}

}