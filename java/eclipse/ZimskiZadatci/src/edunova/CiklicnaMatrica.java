package edunova;

import javax.swing.JOptionPane;

public class CiklicnaMatrica {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Unesi jedan broj"));

		int matrica[][] = new int[n][n];
		int maxR = n - 1;
		int minR = 0;
		int minS = 0;
		int maxS = n - 1;
		int vrijednost = 1;
		int i,j;
		
		if(vrijednost<=n*n) {
			for(j=maxS;j>=minS;j--) {
				matrica[maxR][j] = vrijednost++;
				
				if(vrijednost>n*n) 
					break;
			} 
			maxR--;
			
			
			for(i=maxR;i>=minR;i--) {
				matrica[i][minS] = vrijednost++;
				
				if(vrijednost>n*n) 
					break;
			}
			minS++;
			
			
			for(j=minS; j<=maxS;j++) {
				matrica[minR][j] = vrijednost++;
				
				if(vrijednost>n*n) 
					break;
			}
			minR++;
			
			for(i=minR;i<=maxR;i++) {
				matrica[i][maxS]= vrijednost++;
			}
			maxS--;
				
			
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				System.out.print(matrica[i][j] + " ");
			}
			System.out.println();
		}
		
		

	}

}