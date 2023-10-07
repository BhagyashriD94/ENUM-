package enumVsConstructor;

public enum Colour {
	BLUE,RED{
	public void info() {
		System.out.println("Dangerace colour");
}
	},GREEN;
	public void info()
	{
		System.out.println("Universal colour");
	}

}
class Test4{
	public static void main(String[] args) {
		Colour[] c=Colour.values();
		for(Colour c1:c)
		{
			c1.info();
		}
	}
}