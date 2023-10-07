package enumVsConstructor;

public enum Beer {
	KF,KO,RC,FO;
	Beer()
	{
		System.out.println("constructor");
	}

}
class Test
{
public static void main(String[] args) {
	Beer b=Beer.KF;
	System.out.println("HELLO");
}	
}