package javafestival;

import java.util.Scanner;

public class Q13_약수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("구하고 싶은 약수를 입력하시오 : ");
		int num = sc.nextInt();
		for(int i = 1; i<=num; i++) {
			System.out.print(i + " : ");
			for(int y = 1; y<=i; y++) {
				if(i%y==0) {
					System.out.print(y + " ");
				}
			}
			System.out.println();
		}
	}

}
