package factoryMethod;

public abstract class FactoryM {
	abstract Customer factMethod(String str);
	final void getInstance(String str) {
		Customer c=factMethod(str);
		c.printType();
	}
}
