public class Sorts {
	public static void selectionsort(int[] a) {
		if(a.length == 0) {System.out.print("");}
		
		int sm = 2147483647;
		int sml = 0;
		int plh = 0;
		for(int q = 0; q < a.length - 1; q++) {
			for(int w = q; w < a.length; w++) {
				if(a[w] < sm) {sm = a[w]; sml = w;}
			}
			plh = a[q];
			a[q] = sm;
			a[sml] = plh;
			sml = 0; sm = 2147483647; plh = 0;
		}
		String s = "[";
		for(int e = 0; e < a.length - 1; e++) {
			s += a[e];
			s += ",";
		}
		s += a[a.length - 1];
		s += "]";
		System.out.println(s);
	}
	
	public static void main(String[] yeeyee) {
		try {
			int[] b = {1,2147483647,85,35};
			selectionsort(b);
		}
		catch(ArrayIndexOutOfBoundsException e) {System.out.println("Put stuff in your array!");}
	}
}