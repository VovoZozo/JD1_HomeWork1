package by.htp.homework1.cycles.main;

public class Task16 {
	//16. Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).
	public static void main(String[] args) {
		System.out.println("Task16");
		proc();
	}
	public static void proc() {
		int sum = 1;
		long pr = 1;
		for (int i = 2; i<=10; i++) {
			sum = sum+i;
			pr = pr*sum;
		}
		System.out.println("(1+2)*(1+2+3)*...*(1+2+...+10) = " + pr);
	}
}
