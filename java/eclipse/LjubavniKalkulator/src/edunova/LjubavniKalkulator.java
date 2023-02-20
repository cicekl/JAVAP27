package edunova;

public class LjubavniKalkulator {
	
	public static void main(String[] args) {
		
		String prvoIme = Metode.unosImena("Unesi prvo ime:");
		String drugoIme = Metode.unosImena("Unesi drugo ime:");
		
		String postotak = "";
		
		for(int i: Metode.ljubavniKalkulator(Metode.zbrajanjeBrojeva(prvoIme, drugoIme))) {
			postotak+=i;
		}
		System.out.println(prvoIme + " i " + drugoIme + " se vole " + postotak + "%.");

		
		
		
		
	
	
		
	}

}
