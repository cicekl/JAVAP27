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
	
	
	
	/* public static Object zbrajanjeBrojeva(int duljinaPolja, int[] polje) {
	    if (duljinaPolja == 2) {
	        int sum = polje[0] + polje[1];
	        if (sum >= 10) {
	            int[] result = {sum / 10, sum % 10};
	            return result;
	        } else {
	            return sum;
	        }
	    }

	    int brojac = 0;
	    int[] novoPolje;
	    if (duljinaPolja % 2 == 0) {
	        duljinaPolja = duljinaPolja / 2;
	        novoPolje = new int[duljinaPolja];
	    } else {
	        duljinaPolja = (duljinaPolja + 1) / 2;
	        novoPolje = new int[duljinaPolja];
	        novoPolje[duljinaPolja - 1] = polje[polje.length - 1];
	    }
	    int j = polje.length - 1;
	    for (int i = 0; i < duljinaPolja; i++) {
	        int sum = polje[i] + polje[j];
	        if (sum >= 10) {
	            int[] result = {sum / 10, sum % 10};
	            novoPolje[i] = result[0];
	            int[] tempPolje = Arrays.copyOf(novoPolje, novoPolje.length + 1);
	            tempPolje[tempPolje.length - 1] = result[1];
	            novoPolje = tempPolje;
	        } else {
	            novoPolje[i] = sum;
	        }
	        j = j - 2;
	    }
	    return zbrajanjeBrojeva(novoPolje.length, novoPolje);
	} */
	


}
	

	
	
	
	
	
	
	
	
	

