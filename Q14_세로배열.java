package javafestival;

import java.util.Scanner;

public class Q14_세로배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기 입력 : ");
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int y = 0; y<n; y++) {
				arr[i][y] = (i+1) + (5*y);
				System.out.print(arr[i][y] + " ");
			}
			System.out.println();
		}
	}

}
