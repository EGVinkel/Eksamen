import java.util.Scanner;

public class Bonus1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		double a = scan.nextDouble(); //scanner inputtal i konsol.
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double x=a;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		if (a>b){
			x = b;
		}
		if (x>c) {
			x=c; 
		}
		System.out.println(x);
	}

}
