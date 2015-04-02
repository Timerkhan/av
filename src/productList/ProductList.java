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
        char[] c_arr = a.toCharArray();
        for (int i = 0; i < c_arr.length; i++) {
            if (c_arr[i] >= '\u0030' && c_arr[i] <= '\u0039' || c_arr[i] >= '\u0061' && c_arr[i] <= '\u007A'
                    || c_arr[i] >= '\u0411' && c_arr[i] <= '\u044F' || c_arr[i] >= '\u0041' && c_arr[i] <= '\u005A') {
                c_arr[i] = c_arr[i];
            }
            else{
                c_arr[i] = '\u0020';
            }
        }
        String b = new StringBuilder("").append(c_arr).toString().replaceAll(" ", "").toLowerCase();;
        return b;
    }


    public static void main(String[] args) {
        String n = "heLloж";
        System.out.println(getNumberStandartChars(n));
    }
}

