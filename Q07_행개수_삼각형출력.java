package javafestival;

import java.util.Scanner;

public class Q07_행개수_삼각형출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int row = sc.nextInt();
		for(int i = row; i>=1; i--) {
			for(int y = 1; y<=i; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
