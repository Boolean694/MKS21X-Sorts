public class Sorts {
	public static void selectionSort(int[] a) {
		if(a.length == 0) {System.out.print("[]");}
		int sm = 2147483647;
		int sml = 0;
		int plh = 0;
		if(a.length != 0) {
		for(int q = 0; q < a.length - 1; q++) {
			for(int w = q; w < a.length; w++) {
				if(a[w] < sm) {sm = a[w]; sml = w;}
			}
			plh = a[q];
			a[q] = sm;
			a[sml] = plh;
			sml = 0; sm = 2147483647; plh = 0;
		}
		}
		/*String s = "[";
		for(int e = 0; e < a.length - 1; e++) {
			s += a[e];
			s += ",";
		}
		s += a[a.length - 1];
		s += "]";
		System.out.println(s);*/
	}
	public static void bubbleSort(int[] a) {
		if(a.length == 0){System.out.println("[]");}
		if(a.length == 1){System.out.println("[" + a[0] + "]");}
		int plh = 0;
		if(a.length != 0) {
		for(int q = a.length - 1; q > 0; q--) {
			for(int w = 0; w < q; w++) {
				if(a[w] > a[w + 1]) {
					plh = a[w];
					a[w] = a[w + 1];
					a[w + 1] = plh;
					plh = 0;
				}
				else{plh += 0;}
			}
		}
		}
		/*String s = "[";
		for(int e = 0; e < a.length - 1; e++) {
			s += a[e];
			s += ",";
		}
		s += a[a.length - 1];
		s += "]";
		System.out.println(s);*/
	}
	public static void insertionSort(int[] a) {
	    if(a.length == 0) {System.out.println("[]");}
	    if(a.length == 1) {System.out.println("[" + a[0] + "]");}
	    int plh = 0;
		int place = 0;
		boolean te = true;
	    if(a.length != 0) {
	    for(int q = 1; q < a.length; q++)  {
	        if(a[q] < a[q - 1]) {
				for(int wer = (q - 1); wer >= 0; wer--) {
					if(a[wer] < a[q]) {
						place = wer + 1;
						te = false;
						break;
					}
				}
				if(te) {place = 0;}
			}
			plh = a[q];
			for(int af = (q - 1); af >= place; af--) {
				a[af + 1] = a[af];
			}
			a[place] = plh;
			plh = 0;
			place = 0;
			te = true;
	    }
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
	public static void main(String[] et) {
		int[] b = {9,0,8,1,7,2,7,6,7,3,7,5,4};
		insertionSort(b);
	}
}
