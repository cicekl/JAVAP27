package edunova;

public class LjubavniKalkulator {
	
	public static void main(String[] args) {
		
		String prvoIme = Metode.unosImena("Unesi prvo ime:");
		String drugoIme = Metode.unosImena("Unesi drugo ime:");
		String imena = prvoIme.toUpperCase()+drugoIme.toUpperCase();
//		for(int i=0;i<imena.length();i++) {
//			brojac++;
//		}
		int brojac=imena.length();
		
		int prviRed [] = new int[brojac];
		
		int i, index=0;
		
		for(i=0;i<imena.length();i++) {
			prviRed[i]=Metode.brojacSlova(imena, i);
//			 char c = imena.charAt(i);
//			    if (imena.indexOf(c) == imena.lastIndexOf(c)) {
//			        prviRed[index] = Metode.brojacSlova(imena, c);
//			        index++;
//			    }
		}
		
//		int broj=Metode.zbrajanjeBrojeva(brojac, prviRed);
//		System.out.println(broj);
		
	}

}
