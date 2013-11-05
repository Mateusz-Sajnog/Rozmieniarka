package javahive;

public class RozmieniarkaMSImpl implements Rozmieniarka{

	
	public Nominaly rozmien(double kwota, double[] dostepneNominaly) {
		if(kwota < 0){
			throw new ArithmeticException();
		}		
		Nominaly rozmienione = new Nominaly();
		double kwota2 = kwota;
		int ilosc = 0;
		int sto = 100;
		for (int i = 0; i < dostepneNominaly.length; i++) {

		 if(kwota2/dostepneNominaly[i] > 0)
		 {
			 ilosc = (int) (kwota2/dostepneNominaly[i]);	
			 rozmienione.setIlosc(dostepneNominaly[i], ilosc);
			 kwota2 *= sto;
			 kwota2 -= (dostepneNominaly[i] * ilosc * sto); 
			 kwota2  = Math.round(kwota2);
			 kwota2 /= sto;
			 
			 if(kwota2 == 0.00)
			 {
				 return rozmienione;
			 }
		 }
		
			
		}
		return null;
	}
	
	
}
