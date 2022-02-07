package utility;

import java.math.BigDecimal;
import java.util.Scanner;

public class Unos {
	public static int unesiInt(Scanner ulaz, String poruka) {
		int i = 0;
		while (true) {
			System.out.print(poruka + ": ");
			try {	
				i = Integer.parseInt(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Unos mora biti broj");
				continue;
			}
			if (i < 1) {
				System.out.println("Broj mora biti pozitivan");
				continue;
			}
			return i;
		}
	}
	
	public static int unesiInt( Scanner ulaz, String poruka, int min, int max) {
		int i=0;
		while(true) {
			System.out.print(poruka + ": ");
			try {
				i = Integer.parseInt(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Unos mora biti broj");
				continue;
			}
			
			if(i<min || i>max) {
				System.out.println("Broj mora biti između " + min + " i " + max);
				continue;
			}
			return i;
		}
	}
	
	
	public static BigDecimal unesiBigDecimal(Scanner ulaz, String poruka) {
		BigDecimal i = BigDecimal.ZERO;
		while (true) {
			System.out.print(poruka + ": ");
			try {
				i = new BigDecimal(ulaz.nextLine());
			} catch (Exception e) {
				System.out.println("Unos mora biti broj");
				continue;
			}
			if (i.compareTo(BigDecimal.ONE) < 0) {
				System.out.println("Broj mora biti pozitivan");
				continue;
			}
			return i;
		}
	}

	public static String unesiString(Scanner ulaz, String poruka) {
		String s = "";
		while (true) {
				System.out.print(poruka + ": ");
				try {
					s = ulaz.nextLine();
				} catch (Exception e) {
					System.out.println(poruka);
				}
				
				if (s.length() <3) {
					System.out.println(poruka);
					continue;
				}
				return s;
			} 
		}
	
		public static boolean unesiBoolean(Scanner ulaz, String poruka) {
			String s;
			while (true) {
				System.out.println(poruka + ": ");
				s = ulaz.nextLine();
				if (s.toUpperCase().contentEquals("DA")) {
					return true;
				} else if (s.toUpperCase().contentEquals("NE")) {
					return false;
				} else {
					System.out.println("Unos mora biti da ili ne");
					continue;
				}
			}
		}

}
