package javafestival;

import java.util.Scanner;

public class Q20_성적계산프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("java 점수 : ");
		arr[0] = sc.nextInt();
		System.out.print("web 점수 : ");
		arr[1] = sc.nextInt();
		System.out.print("and 점수 : ");
		arr[2] = sc.nextInt();
		arr[3] = arr[0]+arr[1]+arr[2];
		arr[4] = arr[3]/3;
		
		System.out.println("java : " + arr[0]);
		System.out.println("web : " + arr[1]);
		System.out.println("and : " + arr[2]);
		System.out.println("sum : " + arr[3]);
		System.out.println("avg : " + arr[4]);
		
	}

}
