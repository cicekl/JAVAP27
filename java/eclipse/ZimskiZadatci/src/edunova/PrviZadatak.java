package edunova;

import javax.swing.JOptionPane;

public class PrviZadatak {
	
	public static void main(String[] args) {
		
		int brojevi [] = new int [24];
		
		int i;
		int zbroj=0;
		
		for(i=0;i<24;i++) {
			brojevi[i]=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		}
		
		int min=brojevi[0];
		int max=brojevi[0];
		
		
		for(i=0;i<24;i++) {
			zbroj+=brojevi[i];
		}
		
		for(i=0;i<24;i++) {
			if(brojevi[i]<min) {
				min=brojevi[i];
			} 
			
			if(brojevi[i]>max) {
				max=brojevi[i];
			}
		}
		
		System.out.println("Zbroj ovih 24 brojeva je: " + zbroj);
		System.out.println("Minimalni broj je: " + min);
		System.out.println("Maksimalni broj je: " + max); 
		
		}
	}


