package javafestival;

public class Q12_짝수음수_홀수양수_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i<=100; i++) {
			sum+=i%2==0?-i:i;
			System.out.print(i%2==0?-i + " ":i + " ");
		}
		System.out.println();
		System.out.println("결과 : " + sum);
	}

}
