package javafestival;

import java.util.Scanner;

public class Q29_이진수변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
//		System.out.println(5/2);
		System.out.print("숫자입력>>");
		int num = sc.nextInt();
		
		int sqr = 1;
		//배열 크기를 설정할 변수
		int size = 1;
		while(sqr<num) {
			size++;
			sqr*=2;
			
		}
		int[] arr = new int[size];
		for(int i =0; i<arr.length; i++) {
			arr[i]=num%2;
			num/=2;
		}
		for(int i = arr.length-1; i>=0; i--) {
			if(i==arr.length-1 && arr[arr.length-1]==0 && arr.length != 1) {
				continue;
			}
			System.out.print(arr[i]);
		}
	}

}
