package useofENUM;
enum Beer3
{
	KF,KO,RC,FO;
	}

public class Test1 {
	public static void main(String[] args) {
		Beer3 b1=Beer3.RC;
		switch(b1) {
		case KF:
			System.out.println("it is childrens brand");
			break;
		case KO:
			System.out.println("it is too lite");
			break;
		case RC:
			System.out.println("it is too hot");
			break;
		case FO:
			System.out.println("buy one get one ");
			break;
			default:System.out.println("other brand are not good");

		}
	}

}
