import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class ProductListTest {
    @Test
    public void testGetNumberStandartNotNull() throws Exception {
        String b = ProductList.getNumberStandart("Hello");
        assertNotNull("Check String for null", b);
    }

    @Test
    public void testGetNumberStandart() {
        String d = ProductList.getNumberStandart("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        assertTrue(d == "абвгдеёжзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyz0123456789");
    }
}