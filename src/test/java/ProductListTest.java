import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ProductListTest {
    @Test
    public void testGetNumberStandartChars() {
        for (int i = 0; i < 100000; ++i)  {
            String d = ProductList.getNumberStandartChars("АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            assertTrue(d.equals("абвгдежзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyz0123456789"));

        }
    }

    @Test
    public void speedGetNumberStandartChars(){
        long lBegin = System.currentTimeMillis();
        for (int i = 0; i < 100000; ++i)  {
            String d = ProductList.getNumberStandartChars("АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            assertTrue(d.equals("абвгдежзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyz0123456789"));
        }
        long lEnd = System.currentTimeMillis();
        long lDelta = lEnd - lBegin;
        System.out.println(lDelta);
    }
}

