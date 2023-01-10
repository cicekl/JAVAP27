package edunova;

public class E03_ForeachPetlja {

	public static void main(String[] args) {
		//ispisuje sve elemente niza, od početka
		
		int niz[] = {1,2,3,4,5,6,7,8,9,10};
		
		//ispis s for petljom
		for(int i=0;i<niz.length; i++) {
			System.out.println(niz[i]);
		}
		
		//ispis s foreach petljom - može bilo koje ime varijable
		for(int v: niz) {
			System.out.println(v);
		}
		
		//continue i break rade isto kao i kod for
		
		//isti brojevi u nizu ispisani unazad
		for(int j = niz.length-1; j>-1;j--) {
			System.out.println(niz[j]);
		}

	}

}
