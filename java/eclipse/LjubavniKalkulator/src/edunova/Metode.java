package edunova;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Metode {
	
	public static boolean provjeraStringa(String ime) {
	    char[] chars = ime.toCharArray();
	    
	    if (ime == null || ime.isEmpty()) {
	        return false;
	    }
	    
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
	
	public static int[] znamenke(int[] polje) {
		int counter = 0;
		for (int i: polje) {
			if(i>=10) {
				counter++;
			}
		}
		
		int[] pomocnoPolje = new int[polje.length + counter];
		int index=0;
		
		int i;
		for(i=0;i<polje.length;i++) {
			if(polje[i]<10) {
				pomocnoPolje[index++] = polje[i];
			}else {
				pomocnoPolje[index++] = polje[i]/10;
				pomocnoPolje[index++] = polje[i]%10;
			}
		}
		
		return pomocnoPolje;
		
	}
	
	
	 public static int[] zbrajanjeBrojeva(String prvoIme, String drugoIme) {
	  
	String imena = prvoIme+drugoIme;
	int counter=0;
	char spojenaImena[] = (imena.toUpperCase().toCharArray());
	int pomocnoPolje[] = new int[imena.length()];
	
	int i=0, j=0;
	
	for(i=0;i<imena.length();i++) {
		counter=0;
			for(j=0;j<imena.length();j++) {
				if(spojenaImena[i]==spojenaImena[j]) {
					counter++;
				}
			}
			pomocnoPolje[i]=counter;
	}
	
	int manji=0,veci=0;
	if(prvoIme.length()>drugoIme.length()) {
		veci = prvoIme.length();
		manji = drugoIme.length();
	}else {
		veci = drugoIme.length();
		manji = prvoIme.length();
	}
	
	int pomPolje[]=new int[veci];
	
	if(veci>manji) {
		for(i=0;i<manji;i++) {
			pomPolje[i]=pomocnoPolje[i] + pomocnoPolje[pomocnoPolje.length-1];
			
		}
		for(i=0;i<(veci-manji);i++) {
			pomPolje[manji+i] = pomocnoPolje[manji+i];
		}
	}else {
		for (i = 0; i < manji; i++) {
			pomPolje[i] = pomocnoPolje[i] + pomocnoPolje[pomocnoPolje.length - i - 1];
		}
		for (i = 0; i < (veci - manji); i++) {
			pomPolje[manji + i] = pomocnoPolje[manji + i];
		}
	}
	
	return znamenke(pomPolje);


} 
	 

public static int[] ljubavniKalkulator(int pomocnoPolje[]) {
	
	if(pomocnoPolje.length<=2) {
		return pomocnoPolje;
	}
	
	else {
		if (pomocnoPolje.length % 2 == 0) {
			int postupak[] = new int[(pomocnoPolje.length / 2)];
			for (int i = 0; i < postupak.length; i++) {
				postupak[i] = pomocnoPolje[i] + pomocnoPolje[(pomocnoPolje.length - 1 - i)];
			}
			if (postupak.length > 2) {
				return ljubavniKalkulator(znamenke(postupak));
			} else {
				return ljubavniKalkulator(znamenke(postupak));
			}
		} else {
			int postupak[] = new int[(pomocnoPolje.length / 2) + 1];
			for (int i = 0; i < postupak.length; i++) {
				postupak[i] = pomocnoPolje[i] + pomocnoPolje[pomocnoPolje.length - i - 1];
				postupak[postupak.length - 1] = pomocnoPolje[pomocnoPolje.length / 2];

			}
			if (postupak.length > 2) {
				return ljubavniKalkulator(znamenke(postupak));
			} else
				return ljubavniKalkulator(znamenke(postupak));
		}

	}
	
	
}



}
	

	
	
	
	
	
	
	
	
	

