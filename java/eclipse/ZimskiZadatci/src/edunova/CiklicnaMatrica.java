package edunova;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {

	public static void main(String[] args) {

		int m = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj redaka:"));
		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj stupaca:"));

		int matrica[][] = new int[m][n];
		int maxR = m - 1;
		int minR = 0;
		int minS = 0;
		int maxS = n - 1;
		int vrijednost = 1;
		int i,j;
		
		while(minR <= maxR && minS <= maxS) {
			for(i=maxS;i>=minS;i--) {
				matrica[maxR][i] = vrijednost++;
			} 
			maxR--;
			
			
			for(i=maxR;i>=minR;i--) {
				matrica[i][minS] = vrijednost++;
			}
			minS++;
			
			
			for(i=minS; i<=maxS;i++) {
				matrica[minR][i] = vrijednost++;
			}
			minR++;
			
			for(i=minR;i<=maxR;i++) {
				matrica[i][maxS]= vrijednost++;
			}
			maxS--;
					
		}
		
		for(i=0;i<m;i++) {
			for(j=0;j<n;j++) {
				System.out.printf("%4d", matrica[i][j]);
			}
			System.out.println();
		}
		
		

	}

}