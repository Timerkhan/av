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
        char[] charList = a.toCharArray();
        StringBuilder k = new StringBuilder("");
        for (int i = 0; i < charList.length; i++) {
            if (charList[i] >= '\u0030' && charList[i] <= '\u0039' || charList[i] >= '\u0061' && charList[i] <= '\u007A'
                    || charList[i] >= '\u0410' && charList[i] <= '\u044F' || charList[i] >= '\u0041' && charList[i] <= '\u005A') {
                k.append(charList[i]);
            }
        }
        return k.toString().toLowerCase();
    }


    public static void main(String[] args) {
        String n = "heLloж";
        System.out.println(getNumberStandartChars(n));
    }
}

