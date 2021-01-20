import org.junit.Assert;
import org.junit.Test;



public class CalculatriceTest {

    @Test
    public void testSum() {
        // Given
        Calculatrice calculator = new Calculatrice();
        // When
        int result = calculator.sum(2, 2);
        // Then
        if (result != 4) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }

    @Test
    public void testMinus() {
        Calculatrice calculator = new Calculatrice();
        Assert.assertEquals(0, calculator.minus(2, 2));
    }

    @Test
    public void testMultiply() {
        Calculatrice calculator = new Calculatrice();
        Assert.assertEquals(2, calculator.multiply(1, 2));
    }

    @Test
    public void testDivide() {
        Calculatrice calculator = new Calculatrice();
        Assert.assertEquals(2, calculator.divide(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Calculatrice calculator = new Calculatrice();
        calculator.divide(6, 0);
    }

}
