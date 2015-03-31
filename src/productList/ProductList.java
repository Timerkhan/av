import static org.junit.Assert.assertTrue;

public class ProductList {

    public static String getNumberStandart(String a) {
        try {
            return a.toLowerCase().replaceAll("[^a-z0-9а-я]", "");
        }
        catch (NullPointerException e) {
            return "Enter the Name";
        }
    }

    public static long speedGetNumberStandart(long t){
        long lBegin = System.currentTimeMillis();
        for (int i = 0; i < 100000; ++i)  {
            String d = ProductList.getNumberStandart("АБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
            assertTrue(d.equals("абвгдежзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyz0123456789"));
        }
        long lEnd = System.currentTimeMillis();
        long lDelta = lEnd - lBegin;
        return lDelta;
    }

}