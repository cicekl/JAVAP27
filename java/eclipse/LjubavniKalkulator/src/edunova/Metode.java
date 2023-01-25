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
	
	
	public static int zbrajanjeBrojeva(int duljinaPolja, int polje[]) {
	    if (duljinaPolja == 2) {
	        for (int i = 0; i < duljinaPolja; i++) {
	            System.out.print(polje[i] + " ");
	        }
	        return duljinaPolja;
	    }

	    int brojac = 0;
	    if (duljinaPolja % 2 != 0) {
	        duljinaPolja = ((int) duljinaPolja / 2) + 1;
	    } else {
	        duljinaPolja = duljinaPolja / 2;
	    }
	    int novoPolje[] = new int[duljinaPolja];
	    int j = duljinaPolja-1;
	    for (int i = 0; i < duljinaPolja; i++) {
	    	novoPolje[i] = polje[i] + polje[j];
	        j--;
	        if (novoPolje[i] >= 10) {
	            novoPolje[i] = (int) (novoPolje[i] / 10);
	            novoPolje[i + 1] = novoPolje[i] % 10;
	            i++;
	            brojac += 2;
	            continue;
	       
	        }
	        brojac++;
	    }
	    return zbrajanjeBrojeva(brojac, novoPolje);
	}
	
//	public static void ispisKalkulatora(int[] polje) {
//		System.out.println(polje[0]+polje[1]);
//	}
	
	
	
	
	
	
	
	
	

}