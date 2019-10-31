package by.htp.homework1.cycles.main;

public class Task36 {
	/*
	36. Два двузначных числа, записанных одно за другим , образуют четырёхзначное число,
	которое делится на их произведение. Найти эти числа.
	*/
	public static void main(String[] args) {
		System.out.println("Task36");
		proc();
	}
	public static void proc() {
		int fournumber = 0;
		for (int i = 10; i<100; i++) {
			for (int j = 99; j>9; j--) {
				fournumber = i*100+j;
				if (fournumber%(i*j)==0) {
					System.out.println(i + " " + j);
				}
				fournumber = j*100+i;
				if (fournumber%(i*j)==0) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}
