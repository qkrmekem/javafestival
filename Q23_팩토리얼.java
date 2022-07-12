package javafestival;

import java.util.Scanner;

public class Q23_팩토리얼 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int fac = 1;
		for(int i=1; i<=num; i++) {
			fac *= i;
		}
		System.out.println("출력 : " + fac);
	}

}
