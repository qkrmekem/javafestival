package javafestival;

import java.util.Scanner;

public class Q10_일의자리반올림 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값 : ");
		int num = sc.nextInt();
		
		if(num%10 >= 5) {
			num+=10;
		}
		num = (num/10)*10;
		
		
		System.out.println("반올림 후 값 : " + num);
		
	}

}
