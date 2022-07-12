package javafestival;

import java.util.Random;

public class Q28_중복없는로또번호 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int[] lot = new int[6];
		int cnt=0;
//		while(cnt<6) {
//			int num = rd.nextInt(50)+1;
//			boolean same = false;
//			for(int y=0; y<cnt; y++) {
//				if(lot[y]==num) {
//					same = true;
//				}
//			}
//			if(same==true) {
//				continue;
//			}
//			lot[cnt] = num;
//			System.out.println("행운의 숫자 : " + lot[cnt]);
//			cnt++;
//		}
//		
		int[] lot2 = new int[5];
		for(int i=0; i<lot2.length; i++) {
			lot2[i] = rd.nextInt(50)+1;
			for(int y=0; y<i; y++) {
				if(lot2[i]==lot2[y]) {
					i--;
				}
			}
		}
		for(int i = 0; i<lot2.length; i++) {
			System.out.println("행운의 숫자 : " + lot2[i]);
		}
	}

}
