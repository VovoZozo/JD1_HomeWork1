package by.htp.homework1.linear.main;

import java.util.Random;

public class Task06 {
	/*6. Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров
		молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, чем в малом?
	 */
	public static void main(String[] args) {
		System.out.println("task06");
		int n = random();
		int m = random();
		double d = milkSmall(n);
		printint("малых бидонов = ",n," штук");
		printint("больших бидонов = ",m," штук");
		printdouble("Молока в одном малом бидоне = ",d," литров");
		printdouble("Молока в больших бидонах = ",milkBig(d,m)," литров");
	}
	public static int random() {
		Random rand = new Random();
		int x = Math.abs(rand.nextInt(15)+1);
		return x;
	}
	public static double milkSmall(int n) {
		double mL = 1.0*80/n;
		return mL;
	}
	public static double milkBig(double d, int m) {
		double mL = (d+12)*m;
		return mL;
	}
	public static void printdouble(String s, double a, String c) {
		System.out.println(s + a + c);
	}
	public static void printint(String s, int a, String c) {
		System.out.println(s + a + c);
	}
}
