package javafestival;

public class Q08_거리가짧은점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] point = {92, 32, 52, 9, 81, 2, 68};
		int min = 100;
		int big = 0;
		int small = 0;
		
		for(int i = 1; i < point.length; i++) {
			for(int y = i+1; y<point.length; y++) {
				if(point[i]*point[y] < min) {
					min = point[i]*point[y];
					big = i;
					small = y;
				}
			}
			System.out.println();
		}
		if(big<small) {
			int temp = big;
			big = small;
			small = temp;
		}
		
		System.out.println("result = ["+small+", "+big+"]");
	}

}
