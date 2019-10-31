package by.htp.homework1.cycles.main;

import java.util.Scanner;

public class Task32 {
	/*
	32. Проверить введенную пользователем строку на наличие недопустимых символов. В
	качестве первого символа допустимы только буквы и знак подчеркивания. Остальные
	символы могут быть буквами, цифрами и знаком подчеркивания.
	*/
	public static void main(String[] args) {
		System.out.println("Task32");
		proc();
	}
	public static void proc() {
		String pol = scan();
		boolean result = pol.matches("^[a-zA-Z_]\\w+");
		if(result == true){
		    System.out.println("Введенная строка соответствует требованиям");
		}
		else{
		    System.out.println("Введенная строка НЕ соответствует требованиям");    
		}
	}
	public static String scan() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку. В качестве первого символа допустимы только буквы и знак подчеркивания.");
		System.out.println("Остальные символы могут быть буквами, цифрами и знаком подчеркивания.");
		String pol = sc.next();
		return pol;
	}
}
