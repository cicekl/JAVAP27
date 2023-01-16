package edunova;

import javax.swing.JOptionPane;

public class Z02 {
	
	//metoda od korisnika trazi
	//unos broja izmedu 1 i 10
	//te vraca ispravno unesen broj
	
	public static int broj() {
		
		while(true) {
			int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj:"));
			
			if(i>=1 && i<=10) {
				return i;
			}
		}
	}

}
