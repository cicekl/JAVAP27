package edunova;

import javax.swing.JOptionPane;

public class CetvrtiZadatak {
	public static void main(String[] args) {
		
		//Kreirati program koji unosi dvije matrice 4x4 te ispisuje njihov zbroj
		int broj = Integer.parseInt(JOptionPane.showInputDialog("Unesi jedan broj:"));
		
		int matricaPrva [][] = new int [broj][broj];
		int matricaDruga[][] = new int [broj][broj];
	
		
		int i,j;
		
		for(i=0;i<broj;i++) {
			for(j=0;j<broj;j++) {
				matricaPrva[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesi element:"));
			}
		}
		
		for(i=0;i<broj;i++) {
			for(j=0;j<broj;j++) {
				matricaDruga[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Unesi element:"));
			}
		}
		
		int matricaTreca [][] = new int [broj][broj];
		
		for(i=0;i<broj;i++) {
			for(j=0;j<broj;j++) {
				matricaTreca[i][j] = matricaPrva[i][j] + matricaDruga[i][j];
				System.out.print(matricaTreca[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}

}
