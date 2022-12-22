package edunova;

public class TablicaMnozenja {

	public static void main(String[] args) {
		
		int tablica [][] = {
				{1,2,3,4,5,6,7,8,9},
				{2,4,6,8,10,12,14,16,18},
				{3,6,9,12,15,18,21,24,27},
				{4,8,12,16,20,24,28,32,36},
				{5,10,15,20,25,30,35,40,45},
				{6,12,18,24,30,36,42,48,54},
				{7,14,21,28,35,42,49,56,63},
				{8,16,24,32,40,48,56,64,72},
				{9,18,27,36,45,54,63,72,81}
		};
	
		
		int i,j;
	
		for(i=0;i<31;i++) {
			System.out.print("-");
		}
		
		System.out.println("\n: : :  TABLICA  MNOZENJA  : : :");
		
		for(i=0;i<31;i++) {
			System.out.print("-");
		}
		
		System.out.print("\n * "  + "|  " + "1  2  3  4  5  6  7  8  9\n");;
		
		for(i=0;i<31;i++) {
			System.out.print("-");
		}
		
		for(i=0;i<9;i++) {
			System.out.print("\n " + (i+1) + " " + "|  ");
			for(j=0;j<9;j++) {
				if(tablica[i][j]>=10) {
					System.out.print(tablica[i][j] + " ");
			}else if(i==1 & j==3){
				
				System.out.print(tablica[i][j] + " ");
				
			}else if(i==2 & j==2){
				
				System.out.print(tablica[i][j] + " ");
				
			}else if(i==3 & j==1){
				
				System.out.print(tablica[i][j] + " ");
				
			}else if(i==4 & j==0){
				
				System.out.print(tablica[i][j] + " ");
				
			}else if(i==5 & j==0){
				
				System.out.print(tablica[i][j] + " ");
				
			}else if(i==6 & j==0){
				
				System.out.print(tablica[i][j] + " ");
				
			}else if(i==7 & j==0){
				
				System.out.print(tablica[i][j] + " ");
				
			}else if(i==8 & j==0){
				
				System.out.print(tablica[i][j] + " ");
				
			}else {
				System.out.print(tablica[i][j] + "  "); }
		}
		
	}
		System.out.println();
		
		for(i=0;i<31;i++) {
			System.out.print("-");
		}
		
	
		System.out.println("\n:  :  :  :  :  :  :  :by Lorena");
		
		for(i=0;i<31;i++) {
			System.out.print("-");
		}
		
		
} }
