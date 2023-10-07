package enumVsConstructor;

public enum Beer1 {
	KF(70),KO(80),RC(90),FO;
	int price;
	Beer1(int price){
		this.price=price;
	}
	Beer1(){
		this.price=65;
	}
	public int getprice()
	{
		return price;
	}

}
class Test1{
	public static void main(String[] args) {
		Beer1[] b1=Beer1.values();
		for(Beer1 b2:b1)
		{
			System.out.println(b2+"....."+b2.getprice());
		}
	}
}
