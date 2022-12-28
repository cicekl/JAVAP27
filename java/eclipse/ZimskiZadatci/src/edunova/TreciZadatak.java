package edunova;

import javax.swing.JOptionPane;

public class TreciZadatak {

	public static void main(String[] args) {
		
		//Kreirati program koji za dva unesena broja ispisuje sve prim brojeve između njih.

		
		int prvi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		int drugi = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		
		int i,j;
		
		int veci = prvi > drugi ? prvi : drugi;
		int manji = prvi < drugi ? prvi : drugi;
		int zastavica;
		
		for(i=manji;manji<veci;manji++) {
			zastavica=0;
			for(j=2;j<manji;j++) {
				if(manji%j==0) {
					zastavica++;
				}
			}
		
			if(zastavica==0 && manji!=1) {
				System.out.println(manji);
			}
		
	}
	}
}
