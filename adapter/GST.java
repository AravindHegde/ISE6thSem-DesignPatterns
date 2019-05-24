package adapter;

public class GST implements CalcTax {

	@Override
	public float taxAmount(int qty, float price) {
		return qty*price*0.18f;
	}

}