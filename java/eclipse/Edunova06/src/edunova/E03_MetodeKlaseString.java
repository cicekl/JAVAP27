package edunova;

public class E03_MetodeKlaseString {
	
	public static void main(String[] args) {
		
		String rijec = Pomocno.obavezanUnosStringa(
				"Unesi neku riječ:");
		
		try {
			System.out.println(rijec.toUpperCase());
			System.out.println(rijec.toLowerCase());
			System.out.println(rijec.charAt(0));
			System.out.println(rijec.contains("O"));
			System.out.println(rijec.indexOf("i"));
			System.out.println(rijec.substring(1));
			System.out.println(rijec.substring(1,4));
//			System.out.println(Arrays.toString(rijec.split(" ")));
			System.out.println(rijec.split(" ").length);
		} catch (Exception e) {
			System.out.println("Za dani unos program ne može izvršiti operaciju.");
		}
		
	}

}
