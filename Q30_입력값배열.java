package javafestival;

import java.util.Scanner;

public class Q30_입력값배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int y = 0; y<n; y++) {
				arr[i][y]=(y+1)+(i*n);
				System.out.print(arr[i][y]+ " ");
			}
			System.out.println();
		}
	}

}
