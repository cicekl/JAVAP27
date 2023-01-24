package edunova;

import javax.swing.JOptionPane;

public class Metode {
	
	public static boolean provjeraStringa(String ime) {
	    char[] chars = ime.toCharArray();

	    for (char znak : chars) 
	    {
	         if(!Character.isLetter(znak)) 
	         {
	                return false;
	         }
	    }

	    return true;
	}
	
	
	public static String unosImena(String poruka) {
		
		while(true) {
				String ime = JOptionPane.showInputDialog(poruka);
				if(provjeraStringa(ime)) {
					return ime;
				}else {
					JOptionPane.showMessageDialog(null, "Niste unijeli ime!");
			}
	
	} }
	

	
	public static int brojacSlova(String imena, int index) {
		int i=0;
		int brojac=0;
		for(i=0;i<imena.length();i++) {
			if(imena.charAt(i)==imena.charAt(index)) {
				brojac++;
			}
		}
		return brojac;
	}
	
	public static int[] zbrajanjeBrojeva(int duljinaPolja, int polje[]) {
		int i=0;
		int brojac=0;
		int duljina=0;
		int poljeZbroja [] = new int [duljinaPolja];
		for(i=0;i<duljinaPolja;i++) {
			duljina=duljinaPolja;
			poljeZbroja[i]=polje[i]+polje[--duljina];
				if(polje[i]==duljina) {
					poljeZbroja[i]=polje[i];
					brojac++;
					return zbrajanjeBrojeva(brojac, poljeZbroja);	
				}
				
			brojac++;
		} 
			if(poljeZbroja.length==2) {
				return poljeZbroja;
			}
		return zbrajanjeBrojeva(brojac, poljeZbroja);	
	}
	
	
	
	
	
	
	
	
	

}