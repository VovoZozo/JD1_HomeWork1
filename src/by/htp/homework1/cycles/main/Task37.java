package by.htp.homework1.cycles.main;

public class Task37 {
	/*
	37. Даны два двузначных числа А и В. Из этих чисел составили 2 четырехзначных числа:
		первое число получили путем написания сначала числа А, затем В. Для получения второго
		числа сначала записали число В, затем А. Найти числа А и В если известно , что первое
		четырехзначное число нацело делится на 99, а второе на 49.
	*/
	public static void main(String[] args) {
		System.out.println("Task37");
		proc();
	}
	public static void proc() {
		int fournumber1 = 0;
		int fournumber2 = 0;
		for (int i = 10; i<100; i++) {
			for (int j = 10; j<100; j++) {
				fournumber1 = i*100+j;
				fournumber2 = j*100+i;
				if (fournumber1%99==0) {
					if (fournumber2%49==0) {
						System.out.println("Число 1 = " + i +"\n" + "Число 2 = " + j);
					}
				}
			}
		}
	}
}
