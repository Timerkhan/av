/**
 * The {@code getNumberStandartChars} is a method, which takes some String "a" as a parameter.
 * String "a" is the number of a spare part in real life. String "a" can contain any symbols
 * for example: {@code "F23$%^вг о0#@7 ст"}.
 * The method {@code getNumberStandartChars} takes a String "a" and gives the "code" of the spare part.
 * That "code" should to copy String "a", but it may consist of letters of the Latin language
 * and the Russian language in the low case, numbers and don't contain whitespaces;
 * for example: {@code "f23вго07ст"}.
 * The method {@code getNumberStandartChars} deletes all symbols that can't be in the "code".
 * For example: {@code "F23$%^вг о0#@7 ст"} goes to {@code "f23вго07ст"}.
 *
 *  @author  Yarakhmedov Timerkhan
 */


public class ProductList {
    public static String getNumberStandartChars(String a) {
        try {
            char[] charList = a.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < charList.length; i++) {
                if (charList[i] >= '\u0030' && charList[i] <= '\u0039' || charList[i] >= '\u0061' && charList[i] <= '\u007A'
                        || charList[i] >= '\u0430' && charList[i] <= '\u044F') {
                    stringBuilder.append(charList[i]);
                }
                if (charList[i] >= '\u0041' && charList[i] <= '\u005A' || charList[i] >= '\u0410' && charList[i] <= '\u042F') {
                    stringBuilder.append(Character.toLowerCase(charList[i]));
                }
            }
            return stringBuilder.toString();
        }
        catch (NullPointerException e) {
            return "Enter the Name";
        }
    }



    public static void main(String[] args) {
        String n = "heLloж";
        System.out.println(getNumberStandartChars(n));
    }
}

