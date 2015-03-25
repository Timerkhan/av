import junit.framework.TestCase;

public class ProductListTest extends TestCase {
    public ProductListTest(String testName) {
        super(testName);
    }

    public void testFactorialNull() {
        MathFunc math = new MathFunc();
        assertTrue(math.factorial() == 1);
    }

    public void testFactorialPositive() {
        MathFunc math = new MathFunc(5);
        assertTrue(math.factorial() == 120);
    }

    public void testPlus() {
        MathFunc math = new MathFunc(45);
        assertTrue(math.plus(123) == 168);
    }

}