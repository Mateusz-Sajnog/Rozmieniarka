package javahive;

public class RozmieniarkaMSimpl implements Rozmieniarka{

	
	public Nominaly rozmien(double kwota, double[] dostepneNominaly) {
		Nominaly rozmienione = new Nominaly();
		
		int ilosc = 0;
		for (int i = 0; i < dostepneNominaly.length; i++) {

		 if(kwota/dostepneNominaly[i] > 0);
		 {
			 ilosc = (int) (kwota/dostepneNominaly[i]);	
			 rozmienione.setIlosc(dostepneNominaly[i], ilosc);
			 kwota -= dostepneNominaly[i] * ilosc; 
			 if(kwota <= 0)
			 {
				 return rozmienione;
			 }
		 }
		
			
		}
		return null;
	}
	
	
}
