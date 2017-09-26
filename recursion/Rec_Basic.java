package recursion;

public class Rec_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(sum(10));
		//decreasing(5);
		//inc(1);
		odd_even(9);
	}

	private static void odd_even(int i) {
		// TODO Auto-generated method stub
		if(i ==1) {
			return; 
		}
		
		
	}

	private static void inc(int i) {
		// TODO Auto-generated method stub
		if(i == 6) {
			return;
		}
		System.out.println(i);
		inc(i+1);
		
	}

	private static void inc_dec(int i) {
		// TODO Auto-generated method stub
		
		
	}

	private static void decreasing(int i) {
		// TODO Auto-generated method stub
		if(i == 0) {
			return;
		}
		System.out.println(i);
		decreasing(i -1);
		
	}

	private static int sum(int i) {
		// TODO Auto-generated method stub
		
		if(i == 1) {
			return 1;
		}
		int partsum = sum(i-1);
		return i + partsum;
	}

}
