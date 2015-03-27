import org.junit.Test;
import static junit.framework.Assert.*;
import junit.framework.TestCase;

public class ProductListTest {
    @Test
    public void testGetNumberStandartNotNull() throws Exception {
        String b = ProductList.getNumberStandart("Hello");
        assertNotNull("Check String for null", b);
    }
    public void testGetNumberStandartToLowerCase() throws Exception {
        String d = ProductList.getNumberStandart("HELLO");
        assertTrue("hello", d == "hello");
    }
    public void testGetNumberStandartDeleteTrash() throws Exception {
        String d = ProductList.getNumberStandart("he1 l l 234o");
        assertTrue("hello", d == "hello");
    }
}