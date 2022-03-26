package coercao;

public class Coercao {

	public static void f(double x) {
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		f(3.1416);
		f((byte)1);
		f((short)2);
		f('a');
		f(3);
		f(4L);
		f(5.6F);	
	}
}
