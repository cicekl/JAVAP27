package edunova;

public class E02_KoristenjeMetoda {

	public static void main(String[] args) {
		
		E01_VrsteMetoda.m1_pozdravi(); //ctrl + klik na metodu
		
		System.out.println();
		
//		int i = E01_VrsteMetoda.m2_slucajniBroj();
//		
//		System.out.println(i);
		
		System.out.println(E01_VrsteMetoda.m2_slucajniBroj());
		
		E01_VrsteMetoda.m3_zbroji(2, 4, 5);
		
//		System.out.println(E01_VrsteMetoda.m4_prim(0));
		
		System.out.println(Z01.najveciBroj(2, 20, 5));
		
		System.out.println(Z05.zbrojDecimalnihVrijednosti(2.78, 0.30));
		
	}
	
	
}
