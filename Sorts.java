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
	    if(a.length != 0) {
	    for(int q = 1; q < a.length; q++)  {
	        
	    }
	    }
	}
}
