package javafestival;

import java.util.Random;

public class Q03_배열_최대최소값출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] arr = new int[8];
		int max=0;
		int min=100;
		System.out.print("배열의 모든 값 : ");
		for(int i=0;i<arr.length;i++) {
			arr[i] = rand.nextInt(99)+1;
			System.out.print(arr[i] + " ");
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
