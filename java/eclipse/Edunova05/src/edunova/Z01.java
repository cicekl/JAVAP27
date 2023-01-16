package edunova;

public class Z01 {
	
	//napisite metodu koja prime 3 cijela broja
	//i vraca najveci
	
	public static int najveciBroj(int a, int b, int c) {
		
		if(a>b && a>c) {
			return a;
		}
		
		if(b>c && b>c) {
			return b;
		}
		
		return c;
	}
	

}
