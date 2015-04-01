public class ProductList {

    public static String getNumberStandart(String a) {
        try {
            return a.toLowerCase().replaceAll("[^a-z0-9а-я]", "");
        }
        catch (NullPointerException e) {
            return "Enter the Name";
        }
    }

    public static String getNumberStandartChars(String a) {
        a.toLowerCase();
        char[] c_arr = a.toCharArray();
        for (int i = 0; i < c_arr.length; i++) {
            System.out.println(c_arr[i]);
        }
        String b = new String(c_arr);
        return b;
    }


    public static void main(String[] args) {
        String n = "heLlo";
        System.out.println(getNumberStandartChars(n));
    }
}

