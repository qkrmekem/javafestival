package javafestival;

import java.util.Scanner;

public class Q17_계산대 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("사려는 상품개수를 입력하세요 >> ");
		int vol = sc.nextInt();
		int price = 0;
		price = vol * 10000;
		if(vol>=11) {
			price*=0.9;
		}
		System.out.println("가격은 " + price + "원 입니다.");
	}

}
