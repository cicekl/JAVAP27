package edunova;

import javax.swing.JOptionPane;

public class E01_WhilePetlja {

	public static void main(String[] args) {
		//radi s boolean tipom podatka kao i if
		
		while(true) {
			break;
		}
		
		boolean uvjet=false;
		
		while(uvjet) {
			System.out.println("Osijek"); //neće se ispisati
		}
		
		//for petlja koja se nikad neće izvršiti
		for(int i=0;i>10;i++) {
			System.out.println("Ništa.");
		}
		
		//continue i break rade isto kao s for
		
		int b=0;
		
		while(true) {
			b=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj između 1 i 10"));
			if(b>=1 && b<=10) {
				break;
			}
		} //primjer beskonačne petlje uz prekid
		
		System.out.println(b);

	}

}
