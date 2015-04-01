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
            if (c_arr[i] == '\u0030' || c_arr[i] == '\u0031' || c_arr[i] == '\u0032' || c_arr[i] == '\u0033'
                    || c_arr[i] == '\u0034' || c_arr[i] == '\u0035' || c_arr[i] == '\u0036' || c_arr[i] == '\u0037') {
                String b = new StringBuilder("").append(c_arr[i]);
            }
        }
    }


    public static void main(String[] args) {
        String n = "heLloж";
        System.out.println(getNumberStandartChars(n));
    }
}

