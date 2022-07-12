package javafestival;

import java.util.Scanner;

public class Q11_정보처리기사합격 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("1.소프트웨어 설계 >> ");
		int ss = sc.nextInt();
		System.out.print("2.소프트웨어 개발 >> ");
		int sd = sc.nextInt();
		System.out.print("3.데이터베이스 구축 >> ");
		int db = sc.nextInt();
		System.out.print("4.프로그래밍 언어 활용 >> ");
		int sl = sc.nextInt();
		System.out.print("5.정보시스템 구축관리 >> ");
		int ds = sc.nextInt();
		int sum = ss+sd+db+sl+ds;
		if((ss>=8 && sd>=8 && db>=8 && sl>=8 && ds>=8) && sum>=60) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
	}

}
