package javafestival;

public class Q16_완전수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startValue = 2;
		int endValue = 1000;
		getPerfectNumber(startValue, endValue);
		
	}
	public static void getPerfectNumber(int sv, int ev) {
		System.out.print("2~1000까지의 완전수 : ");
		for(int i = sv; i<=ev; i++) {
			int sum = 0;
			for(int y=1; y<i; y++) {
				if(i%y==0) {
					sum+=y;
				}
				
			}
			if(sum==i) {
				System.out.print(sum + " ");
			}
		}
	}

}
