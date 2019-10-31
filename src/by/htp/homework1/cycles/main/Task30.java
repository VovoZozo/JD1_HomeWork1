package by.htp.homework1.cycles.main;

public class Task30 {
	//30. Написать программу, переводящую римские цифры в арабские.
	public static void main(String[] args) {
		System.out.println("Task30");
		String rom = "MDXCXIII";
		proc(rom);
	}
	public static void proc(String rom) {
		int decimal = 0;
        String rom1 = rom.toUpperCase();
        for (int i = rom1.length() - 1; i >= 0 ; i--) {
            char romchar = rom1.charAt(i);
            switch (romchar) {
                case 'M':
                	decimal = decimal +1000;
                    break;

                case 'D':
                	decimal = decimal + 500;
                    break;

                case 'C':
                	if (i!=(rom1.length() - 1)) {
                		if (rom1.charAt(i+1)=='M'||rom1.charAt(i+1)=='D') {
                    		decimal = decimal - 100;
                    	} else {
                    		decimal = decimal + 100;
                    	}
                	} else {
                		decimal = decimal + 100;
                	}
                    break;

                case 'L':
                	decimal = decimal + 50;
                    break;

                case 'X':
                	if (i!=(rom1.length() - 1)) {
                		if (rom1.charAt(i+1)=='L'||rom1.charAt(i+1)=='C') {
                    		decimal = decimal - 10;
                    	} else {
                    		decimal = decimal + 10;
                    	}
                	} else {
                		decimal = decimal + 10;
                	}
                    break;

                case 'V':
                	decimal = decimal + 5;
                    break;

                case 'I':
                	if (i!=(rom1.length() - 1)) {
                		if (rom1.charAt(i+1)=='X'||rom1.charAt(i+1)=='V') {
                    		decimal = decimal - 1;
                    	} else {
                    		decimal = decimal + 1;
                    	}
                	} else {
                		decimal = decimal + 1;
                	}
                    break;
            }
        }
        System.out.println("Римское число " + rom + " равно арабскому числу " + decimal);
    }
}
