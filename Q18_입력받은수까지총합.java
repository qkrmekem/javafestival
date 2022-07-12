package javafestival;

import java.util.Scanner;

public class Q18_입력받은수까지총합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하시오 : ");
		int max = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=max; i++) {
			sum+=i;
		}
		System.out.println("1부터 "+ max + "까지의 합은 " + sum + "입니다.");
	}

}
