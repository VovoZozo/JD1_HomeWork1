package by.htp.homework1.branch.main;

import java.util.Scanner;

public class Task21 {
	/*
	21. Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка?
			Введи Д или М». В зависимости от ответа на экране должен появиться текст «Мне нравятся
			девочки!» или «Мне нравятся мальчики!».
	*/
	public static void main(String[] args) {
		System.out.println("task21");
		System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		String c = scan();
		proc(c);
	}
	@SuppressWarnings("resource")
	public static String scan() {
		Scanner sc = new Scanner(System.in);
		String a = "Д";
		@SuppressWarnings("unused")
		String b = "М";
		String c = "";
		while (!c.equals(a)||!c.equals(a)) {
			c = sc.next();
			System.out.println("Кто ты: мальчик или девочка? Введи Д или М");
		}
		return c;
	}
	public static void proc(String c) {
		String a = "Д";
		@SuppressWarnings("unused")
		String b = "М";
		if (c.equals(a)) {
			System.out.println("Мне нравятся девочки!");
		} else {
			System.out.println("Мне нравятся мальчики!");
		}
	}
}
