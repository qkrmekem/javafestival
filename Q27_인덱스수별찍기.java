package javafestival;

import java.util.Scanner;

public class Q27_인덱스수별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++) {
			System.out.print(i+1 + "번째 입력 : ");
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " : ");
			for(int y=1;y<=arr[i];y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
