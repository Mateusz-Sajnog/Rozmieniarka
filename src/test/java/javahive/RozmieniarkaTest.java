package javahive;

import static org.junit.Assert.*;
import org.junit.Test;

public class RozmieniarkaTest {
	private final double[] NOMINALY_PL = { 200, 100, 50, 20, 10, 5, 2, 1, .50, .20, .10, .05, .02, 0.01 };
	@Test
	public void PowinienRozmieniacPoprawnie124(){
		//given
		Rozmieniarka rozmieniarka=new RozmieniarkaMSImpl();
		//when
		Nominaly nominaly=rozmieniarka.rozmien(124, NOMINALY_PL);
		//then
		assertTrue(nominaly.getIlosc(100)==1);
		assertTrue(nominaly.getIlosc(20)==1);
		assertTrue(nominaly.getIlosc(2)==2);
	}
	@Test
	public void PowinienRozmieniacPoprawnie125_11(){
		//given
		Rozmieniarka rozmieniarka=new RozmieniarkaMSImpl();
		//when
		Nominaly nominaly=rozmieniarka.rozmien(125.11, NOMINALY_PL);
		//then
		assertTrue(nominaly.getIlosc(100)==1);
		assertTrue(nominaly.getIlosc(20)==1);
		assertTrue(nominaly.getIlosc(5)==1);
	    assertTrue(nominaly.getIlosc(.10) == 1);
	    assertTrue(nominaly.getIlosc(.01) == 1);
	}

	
	@Test(expected = ArithmeticException.class) 
	public void ArgumentyUjemnePowinnyWyrzucaWyjatek()	{
		Rozmieniarka rozmieniarka = new RozmieniarkaMSImpl();
		Nominaly nominaly = rozmieniarka.rozmien(-1, NOMINALY_PL);
		fail();
		
	}
	public void PowinienRozmieniacPoprawnie218_76() {
        // given
        Rozmieniarka rozmieniarka = new RozmieniarkaMSImpl();
        // when
        Nominaly nominaly = rozmieniarka.rozmien(218.76, NOMINALY_PL);
        // then
        assertTrue(nominaly.getIlosc(200) == 1);
        assertTrue(nominaly.getIlosc(10) == 1);
        assertTrue(nominaly.getIlosc(5) == 1);
        assertTrue(nominaly.getIlosc(2) == 1);
        assertTrue(nominaly.getIlosc(1) == 1);
        assertTrue(nominaly.getIlosc(.50) == 1);
        assertTrue(nominaly.getIlosc(.20) == 1);
        assertTrue(nominaly.getIlosc(.05) == 1);
        assertTrue(nominaly.getIlosc(.01) == 1);
}
@Test
public void PowinienRozmieniacPoprawnie591_83() {
        // given
        Rozmieniarka rozmieniarka =new RozmieniarkaMSImpl();
        // when
        Nominaly nominaly = rozmieniarka.rozmien(591.83, NOMINALY_PL);
        // them
        assertTrue(nominaly.getIlosc(200) == 2);
        assertTrue(nominaly.getIlosc(100) == 1);
        assertTrue(nominaly.getIlosc(50) == 1);
        assertTrue(nominaly.getIlosc(20) == 2);
        assertTrue(nominaly.getIlosc(1) == 1);
        assertTrue(nominaly.getIlosc(.50) == 1);
        assertTrue(nominaly.getIlosc(.20) == 1);
        assertTrue(nominaly.getIlosc(.10) == 1);
        assertTrue(nominaly.getIlosc(.02) == 1);
        assertTrue(nominaly.getIlosc(.01) == 1);
}
@Test
public void PowinienRozmieniacPoprawnie388_88() {
        // given
        Rozmieniarka rozmieniarka = new RozmieniarkaMSImpl();
        // when
        Nominaly nominaly = rozmieniarka.rozmien(388.88, NOMINALY_PL);
        // then
        assertTrue(nominaly.getIlosc(200) == 1);
        assertTrue(nominaly.getIlosc(100) == 1);
        assertTrue(nominaly.getIlosc(50) == 1);
        assertTrue(nominaly.getIlosc(20) == 1);
        assertTrue(nominaly.getIlosc(10) == 1);
        assertTrue(nominaly.getIlosc(5) == 1);
        assertTrue(nominaly.getIlosc(2) == 1);
        assertTrue(nominaly.getIlosc(1) == 1);
        assertTrue(nominaly.getIlosc(0.50) == 1);
        assertTrue(nominaly.getIlosc(0.20) == 1);
        assertTrue(nominaly.getIlosc(0.10) == 1);
        assertTrue(nominaly.getIlosc(0.05) == 1);
        assertTrue(nominaly.getIlosc(0.02) == 1);
        assertTrue(nominaly.getIlosc(0.01) == 1);
}
@Test (expected = ArithmeticException.class)
public void PowinienRzucacWyjatekWPrzypadkuUjemnejKwoty() {
        // given
        Rozmieniarka rozmieniarka = new RozmieniarkaMSImpl();
        // when
        final double kwota = -100.0;
        Nominaly nominaly = rozmieniarka.rozmien(kwota, NOMINALY_PL);
        // then
        fail();
}
@Test
public void PowinienPoprawnieRozmieniac1111_11() {
        // given
        Rozmieniarka rozmieniarka = new RozmieniarkaMSImpl();
        // when
        Nominaly nominaly = rozmieniarka.rozmien(1111.11, NOMINALY_PL);
        // then
        assertTrue(nominaly.getIlosc(200) == 5);
        assertTrue(nominaly.getIlosc(100) == 1);
        assertTrue(nominaly.getIlosc(10) == 1);
        assertTrue(nominaly.getIlosc(1) == 1);
        assertTrue(nominaly.getIlosc(0.10) == 1);
        assertTrue(nominaly.getIlosc(0.01) == 1);
}
@Test
public void PowinienPoprawnieRozmieniac0_01() {
        // given
        Rozmieniarka rozmieniarka = new RozmieniarkaMSImpl();
        // when
        Nominaly nominaly = rozmieniarka.rozmien(0.01, NOMINALY_PL);
        // then
        assertTrue(nominaly.getIlosc(0.01) == 1);
}
@Test
public void PowinienPoprawnieRozmieniac1_11() {
        // given
        Rozmieniarka rozmieniarka = new RozmieniarkaMSImpl();
        // when
        Nominaly nominaly = rozmieniarka.rozmien(1.11, NOMINALY_PL);
        // then
        assertTrue(nominaly.getIlosc(1) == 1);
        assertTrue(nominaly.getIlosc(0.10) == 1);
        assertTrue(nominaly.getIlosc(0.01) == 1);
}
@Test
public void PowinienPoprawnieRozmieniac111_11() {
        // given
        Rozmieniarka rozmieniarka = new RozmieniarkaMSImpl();
        // when
        Nominaly nominaly = rozmieniarka.rozmien(111.11, NOMINALY_PL);
        // then
        assertTrue(nominaly.getIlosc(100) == 1);
        assertTrue(nominaly.getIlosc(10) == 1);
        assertTrue(nominaly.getIlosc(1) == 1);
        assertTrue(nominaly.getIlosc(0.10) == 1);
        assertTrue(nominaly.getIlosc(0.01) == 1);
}
@Test
public void PowinienPoprawnieRozmieniac11111_11() {
        // given
        Rozmieniarka rozmieniarka = new RozmieniarkaMSImpl();
        // when
        Nominaly nominaly = rozmieniarka.rozmien(11111.11, NOMINALY_PL);
        // then
        assertTrue(nominaly.getIlosc(200) == 55);
        assertTrue(nominaly.getIlosc(100) == 1);
        assertTrue(nominaly.getIlosc(10) == 1);
        assertTrue(nominaly.getIlosc(1) == 1);
        assertTrue(nominaly.getIlosc(0.10) == 1);
        assertTrue(nominaly.getIlosc(0.01) == 1);
}
}
