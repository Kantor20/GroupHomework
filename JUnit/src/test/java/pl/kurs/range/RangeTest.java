package pl.kurs.range;

import org.junit.*;

import static org.junit.Assert.*;

public class RangeTest {

    /*
        test jednostkowy - weryfikuje dzialanie pojedynczych elementow programu
        test jednostkowy - metoda z @Test
        testy musza byc od siebie niezalezne
        nie boimy sie dlugich nazw testow
     */

    private Range range;

    @Before
//    @After
//    @BeforeClass
//    @AfterClass
    public void init() {
        range = new Range(10, 20);
    }

    @Test
    public void shouldReturnTrueWhenNumberIsInTheRange() {
        boolean result = range.isInTheRange(10);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFasleWhenNumberIsOutOfTheRange() {
        assertFalse(range.isInTheRange(21));
    }

    @Test
    public void shouldReturnCorrectRangeFromOnGetRangeFrom() {
        int from = range.getRangeFrom();
        assertEquals(10, from);
    }

    @Test
    public void shouldReturnIncorrectRangeFromOnGetRangeFrom() {
        int from = range.getRangeFrom();
        assertNotEquals(11, from);
    }

    @Test
    public void shouldCompareTwoDoubles() {
        double a = 2.53;
        double b = 2.55;
        assertEquals(a, b, 0.1);
    }

    @Test
    public void shouldRangeBeNull() {
        Range rangeForTest = null;
        assertNull(rangeForTest);
    }

    @Test
    public void shouldRangeNotBeNull() {
        assertNotNull(range);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowIllegalArgumentExceptionWhenRangeIsNotCorrect(){
        Range range = new Range(20,10);
    }

}