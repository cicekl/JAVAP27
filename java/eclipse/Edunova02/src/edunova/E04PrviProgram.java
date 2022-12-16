package edunova;

import javax.swing.JOptionPane;

public class E04PrviProgram {
	
	public static void main(String[] args) {
		
		//program zbraja dva broja
		
		int prviBroj=Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		
		int drugiBroj=Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));
		
		//ALGORITAM
		int rezultat = prviBroj+drugiBroj;
		
		System.out.println(rezultat);
	}

}
