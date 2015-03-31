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
        for (int i = 0; i < 100000; ++i)  {
            String d = ProductList.getNumberStandart("АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            assertTrue(d.equals("абвгдежзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyz0123456789"));

        }
    }

    @Test
    public void speedGetNumberStandart(){
        long lBegin = System.currentTimeMillis();
        for (int i = 0; i < 100000; ++i)  {
            String d = ProductList.getNumberStandart("АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            assertTrue(d.equals("абвгдежзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyz0123456789"));
        }
        long lEnd = System.currentTimeMillis();
        long lDelta = lEnd - lBegin;
        System.out.println(lDelta);
    }
}
