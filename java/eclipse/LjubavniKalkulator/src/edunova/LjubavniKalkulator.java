package edunova;

public class LjubavniKalkulator {
	
	public static void main(String[] args) {
		
		String prvoIme = Metode.unosImena("Unesi prvo ime:").toUpperCase();
		String drugoIme = Metode.unosImena("Unesi drugo ime:").toUpperCase();
		int brojac=0;
		String imena = prvoIme+drugoIme;
		for(int i=0;i<imena.length();i++) {
			brojac++;
		}
		
		int prviRed [] = new int[brojac];
		
		int i, index=0;
		
		for(i=0;i<brojac;i++) {
			prviRed[i]=Metode.brojacSlova(imena, i);
		}
		
		int postotakKalkulatora [] = Metode.zbrajanjeBrojeva(brojac, prviRed);
		System.out.println(prvoIme+" i "+drugoIme+" se vole "+postotakKalkulatora[0]+postotakKalkulatora[1]+"%.");
		
		
	}

}
