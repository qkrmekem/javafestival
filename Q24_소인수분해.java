package javafestival;

import java.util.Scanner;

public class Q24_소인수분해 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int num = sc.nextInt();
		
		int a = 2;
		System.out.print(num + " = ");
		while(num>1){
			for(int i=2; i<a; i++) {
				if(i%a==0) {
					a++;
					continue;
				}
			}
			if(num%a==0) {
				System.out.print(a);
				num/=a;
				if(num!=1) {
					System.out.print("*");
				}
			}else {
				a++;
			}
		}
	}

}
