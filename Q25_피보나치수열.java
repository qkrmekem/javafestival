package javafestival;

public class Q25_피보나치수열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 9;
		
		for(int i = 1; i<= input; i++) {
			System.out.println(fibo(i)+" ");
		}
	}
	
	public static int fibo(int i) {
		//첫번째 숫자를 저장할 변수
		int pre = 0;
		//두번재 숫자를 저장할 변수
		int cur = 1;
		
		//i번재 인덱스까지 피보나치 수열을 구하는 반복문
		for(int y = 1; y<i; y++) {
			int temp = cur;
			cur += pre;
			pre = temp;
		}
		return cur;
	}

}
