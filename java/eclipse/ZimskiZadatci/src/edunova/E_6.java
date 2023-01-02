package edunova;

public class E_6 {

	public static void main(String[] args) {
		//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
		
		int i,j;
		int zbrojPrvi=0;
		int zbrojDrugi=0;
		
		for(i=1;i<=100;i++) {
			zbrojPrvi+=i*i;
		}
		
		for(i=1;i<=100;i++) {
			zbrojDrugi+=i;
		}
		
		zbrojDrugi= zbrojDrugi*zbrojDrugi;

		System.out.println(zbrojDrugi-zbrojPrvi);
	}

}
