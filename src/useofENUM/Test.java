package useofENUM;

public class Test {
	enum Beer{
		KF,KO,RC,FO;
	}
	public static void main(String[] args) {
		Beer b=Beer.FO;
		System.out.println(b);
	}

}
//enum Beer{
//	KF,KO,RC,FO;
//}