package javafestival;

import java.util.Scanner;

public class Q04_곱하기과정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 입력 >>");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 >>");
		int num2 = sc.nextInt();
		int div = 1;
		int result = 0;
		while(div < num1) {
			int temp = num2/div;
			temp = temp%10;
			System.out.println(temp*num1);
			result += temp*num2*div;
			div = div*10;
		}
		System.out.println(result);
	}

}
