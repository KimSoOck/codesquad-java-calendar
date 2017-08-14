package Ex2.calendar;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 수: ");
		int number1 = scanner.nextInt();
		
		System.out.print("두번째 수: ");
		int number2 = scanner.nextInt();

		System.out.println("두 수의 합: " + (number1+number2)); 
	}

}
