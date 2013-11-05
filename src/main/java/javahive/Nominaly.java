package javahive;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * 
 * @author Marcin Grabowiecki
 * Reprezentuje ilości nominałów
 *
 *
 */

public class Nominaly {
	
	private LinkedHashMap<Double, Integer> pieniadze = new LinkedHashMap<Double, Integer>();

	public void setIlosc(double nominal, int ile) {
		pieniadze.put(nominal, ile);
	}

	public int getIlosc(double nominal){
		if(pieniadze.containsKey(nominal)) {
			return pieniadze.get(nominal);
		}
		return 0;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Entry<Double, Integer> e : pieniadze.entrySet()) {
			sb.append(String.format("%s zł X %s\n", e.getKey(), e.getValue()));
		}
		return sb.toString();
	}
}
