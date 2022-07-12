package javafestival;

import java.util.Scanner;

public class Q26_증가값누적 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		int sum = 1;
		for(int i = 1; i <= num; i++) {
			System.out.print(sum+" ");
			sum+=i;
		}
	}

}
