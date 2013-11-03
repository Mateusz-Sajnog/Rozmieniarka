package javahive;

public class RozmieniarkaMSImpl implements Rozmieniarka{

	
	public Nominaly rozmien(double kwota, double[] dostepneNominaly) {
		if(kwota < 0){
			throw new ArithmeticException();
		}		
		Nominaly rozmienione = new Nominaly();
		
		int ilosc = 0;
		for (int i = 0; i < dostepneNominaly.length; i++) {

		 if(kwota/dostepneNominaly[i] > 0);
		 {
			 ilosc = (int) (kwota/dostepneNominaly[i]);	
			 rozmienione.setIlosc(dostepneNominaly[i], ilosc);
			 kwota *=100;
			 kwota -= (dostepneNominaly[i] * ilosc * 100); 
			 kwota  = Math.round(kwota);
			 kwota /= 100;
			 
			 if(kwota == 0.00)
			 {
				 return rozmienione;
			 }
		 }
		
			
		}
		return null;
	}
	
	
}
