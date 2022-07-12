package javafestival;

import java.util.Scanner;

public class Q05_최대공약수_최소공배수 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자1입력>>");
		int num1 = sc.nextInt();
		System.out.print("숫자2입력>>");
		int num2 = sc.nextInt();
		int big = 0;
		int small = 0;
		if(num1>num2) {
			big = num1;
			small = num2;
		}else {
			big = num2;
			small = num1;
		}
		int max = 0;
		int min = 0;
		
		for(int i = 1; i<big; i++) {
			if(num1%i==0 && num2%i==0) {
				max = i;
			}
			for(int y = 1; small*y<=big*i; y++) {
				if(min == 0 && small*y == big*i) {
					min = small*y;
				}
			}
		}
		
		System.out.println("최대 공약수 : " + max);
		System.out.println("최소 공배수 : " + min);
		
		//유클리드호제법
		int rest = 0;
		int gcd = gcd(num1, num2);
		System.out.println("최대 공약수 : " + gcd);
		int lcm = num1 * num2 /gcd;
		System.out.println("최소 공배수 : " + lcm);
	}
	public static int gcd(int num1, int num2) {
		int rest = 0;
		while(num2 != 0) {
			rest = num1 % num2;
			num1 = num2;
			num2 = rest;
		}
		return num1;
	}

}
