package javafestival;

import java.util.Scanner;

public class Q01_십의자리버리기 {

	public static void main(String[] args) {
		// 십의자리 이하를 버리는 코드를 작성하시오
		System.out.print("정수입력 : ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		num = (num/100) *100;
		System.out.println("결과 : " + num);
	}

}
