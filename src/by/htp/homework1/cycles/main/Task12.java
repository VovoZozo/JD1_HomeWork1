package by.htp.homework1.cycles.main;

public class Task12 {
	/*
	12. Последовательность аn строится так: а1 = 1, an =6+ аn-1 , для каждого n >1 Составьте
		программу нахождения произведения первых 10 членов этой последовательности.
		*/
	public static void main(String[] args) {
		System.out.println("Task12");
		proc();
	}
	public static void proc() {
		int a1 = 1;
		int pr = a1;
		for (int i=2;i<11;i++) {
			pr*=(6+(i-1));
		}
		System.out.println("Произведение первых 10 членов этой последовательности а1 = 1, an =6+ аn-1 , для каждого n >1 : " + pr);
	}
}
