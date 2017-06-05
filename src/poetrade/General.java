package poetrade;

import poetrade.AnyExToC;
import poetrade.AnyCToEx;

public class General {

	public static void main(String[] args) throws InterruptedException {
		
	String liga, liga2;
	
	liga = AnyCToEx.CTE(null);
	System.out.println("w " + liga);	
	
	liga2 = AnyExToC.ETC(null);
	System.out.println("w " + liga2);
	
	}

}
