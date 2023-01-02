package edunova;

public class E_4 {

	public static void main(String[] args) {
		
	//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.  
	//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
		
		
	int i,j;
	int broj=0;
	for(i=2500;;i++) {
	int kriterij=1;
	for(j=1;j<20;j++) {
		if(i%j!=0) {
			kriterij=0;
			break;
		}
	}
		if(kriterij==1) {
			broj=i;
			break;
		}
		
	}
	
System.out.println(broj);	
		

	}

}
