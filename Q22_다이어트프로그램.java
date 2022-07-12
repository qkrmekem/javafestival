package javafestival;

import java.util.Scanner;

public class Q22_다이어트프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----다이어트 프로그램----");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게를 입력하시오 : ");
		int current = sc.nextInt();
		System.out.print("현재 몸무게를 입력하시오 : ");
		int target = sc.nextInt();
		
		int cnt = 1;
		while(current>target) {
			System.out.print(cnt + "주차 감량 몸무게 입력 : ");
			current -= sc.nextInt();
			cnt++;
		}
		System.out.println(cnt + "주차 다이어트 성공!!");
	}

}
