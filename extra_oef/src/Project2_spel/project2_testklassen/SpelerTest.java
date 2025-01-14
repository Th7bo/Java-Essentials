package Project2_spel.project2_testklassen;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import Project2_spel.Speler;
import org.junit.Test;

public class SpelerTest {
    private static final int GEBOORTEJAAR =  2003;
    private static final int GEBOORTEJAAR_IN_TOEKOMST = LocalDate.now().plusYears(1).getYear();

    @Test
    public void testConstructor() {
        Speler speler = new Speler("Speler1", GEBOORTEJAAR);
        assertNotNull(speler);
        assertEquals("Speler1", speler.getNaam());
        assertEquals(GEBOORTEJAAR, speler.getGeboortejaar());
    }
    
    @Test
    public void testConstructorGeboortejaar1900() {
        Speler speler = new Speler("Speler1", 1900);
        assertNotNull(speler);
        assertEquals("Speler1", speler.getNaam());
        assertEquals(1900, speler.getGeboortejaar());
    }
    
    @Test
    public void testConstructorGeboortejaar1899() {
        Speler speler = new Speler("Speler1", 1899);
        assertNotNull(speler);
        assertEquals("Speler1", speler.getNaam());
        assertEquals(0, speler.getGeboortejaar());
    }

    @Test
    public void testConstructorGeboortedatumNietInToekomst() {
        Speler speler = new Speler("Speler1", GEBOORTEJAAR_IN_TOEKOMST);
        assertNotNull(speler);
        assertEquals(0, speler.getGeboortejaar());
    }

    @Test
    public void testSetGeboortedatumNietInToekomst() {
        Speler speler = new Speler("Speler1", GEBOORTEJAAR);
        speler.setGeboortejaar(GEBOORTEJAAR_IN_TOEKOMST);
        assertEquals(0, speler.getGeboortejaar());
    }
    
    @Test
    public void testSetGeboortedatumNietVoor1900() {
        Speler speler = new Speler("Speler1", GEBOORTEJAAR);
        speler.setGeboortejaar(1899);
        assertEquals(0, speler.getGeboortejaar());
    }

    
    @Test
    public void testSetGeboortedatum1900() {
        Speler speler = new Speler("Speler1", GEBOORTEJAAR);
        speler.setGeboortejaar(1900);
        assertEquals(1900, speler.getGeboortejaar());
    }
    @Test
    public void testGetLeeftijdGeeftNegatiefGetalIndienGeboortejaarNul() {
        Speler speler = new Speler("Speler1", 0);
        assertEquals(-1, speler.getLeeftijd());
    }

    @Test
    public void testGetLeeftijdGeeftCorrecteWaarde() {
        int achtJaarGeleden = LocalDate.now().minusYears(8).getYear();
        Speler speler = new Speler("Speler1", achtJaarGeleden);
        assertEquals(8, speler.getLeeftijd());
    }
}
