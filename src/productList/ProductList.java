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
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < charList.length; i++) {
            if (charList[i] >= '\u0030' && charList[i] <= '\u0039' || charList[i] >= '\u0061' && charList[i] <= '\u007A'
                    || charList[i] >= '\u0430' && charList[i] <= '\u044F' ) {
                stringBuilder.append(charList[i]);
            }
            if(charList[i] >= '\u0041' && charList[i] <= '\u005A' || charList[i] >= '\u0410' && charList[i] <= '\u042F'){
                stringBuilder.append(Character.toLowerCase(charList[i]));
            }
        }
        return stringBuilder.toString();
    }


    public static void main(String[] args) {
        String n = "heLloж";
        System.out.println(getNumberStandartChars(n));
    }
}

