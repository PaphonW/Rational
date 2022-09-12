import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testSub() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testMal() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 6;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 3;
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(9, x.denominator);
    }

    @Test
    public void testDiv() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 6;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 3;
        x.divide(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testEqu() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 2;
        Rational z = new Rational();
        z.numerator = 1;
        z.denominator = 3;
        Assert.assertEquals(true, x.equals(y));
        Assert.assertEquals(false, x.equals(z));
    }

    @Test
    public void testCom() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 2;
        Rational z = new Rational();
        z.numerator = 1;
        z.denominator = 3;
        Assert.assertEquals(1, x.compareTo(z));
        Assert.assertEquals(-1, x.compareTo(y));
        Assert.assertEquals(0, x.compareTo(x));
    }

    @Test
    public void testStr() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Assert.assertEquals("1/2", x.toString());
    }
}

