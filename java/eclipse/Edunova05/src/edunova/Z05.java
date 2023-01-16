package edunova;

public class Z05 {
	
	//metoda prima dva decimalna broja
	//metoda vraca zbroj samo
	//decimalnih vrijednosti
	
	//3.14, 1.12
	//0.24
	
	//2.78, 0.30
	//1.08
	
	public static double zbrojDecimalnihVrijednosti (double x, double y) {
		
		x = x - (int)x;
		y = y - (int)y;
		
		double zbroj = x + y;
		
		return zbroj;
		
	}
	

}
