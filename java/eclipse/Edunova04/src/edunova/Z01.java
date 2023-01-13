package edunova;

public class Z01 {

	public static void main(String[] args) {
		// while metodom ispisati zbroj prvih 100 brojeva
		
		int i=0;
		int zbroj=0;
		
		while(i<100) {
			++i;
			zbroj+=i;
		}
		
		System.out.println(zbroj);

	}

}
