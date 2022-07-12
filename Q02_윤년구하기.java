package javafestival;

import java.util.Scanner;

public class Q02_윤년구하기 {

	public static void main(String[] args) {
		// 윤년이란2월에29일이 있는 날을 말한다.
		//4의 배수이면서100의 배수가 아닐 때는 윤년이다.
		//400의 배수일 때 윤년이다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		if(year%4==0 && year%100 != 0) {
			System.out.println("윤년");
		}else if (year%400==0) {
			System.out.println("윤년");
		}else {
			System.out.println("윤년 아님");
		}
	}

}
