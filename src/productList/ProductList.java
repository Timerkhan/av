/**
 * The {@code getNumberStandartChars} is a method, which takes a {@param  String a}  as a parameter.
 * {@param  String a} is the number of a spare part in real life. {@param  String a} can contain any symbols
 * for example: {@code "F23$%^вг о0#@7 ст"}.
 * The method {@code getNumberStandartChars} takes a {@param  String a} and gives the "code" of the spare part.
 * That "code" should to copy {@param  String a}, but it may consist of letters of the Latin language
 * and the Russian language in the low case, numbers and don't contain whitespaces;
 * for example: {@code "f23вго07ст"}.
 * The method {@code getNumberStandartChars} deletes all symbols that can't be in the "code".
 * For example: {@code "F23$%^вг о0#@7 ст"} goes to {@code "f23вго07ст"}.
 *
 *  @author  Yarakhmedov Timerkhan
 */


public class ProductList {
    public static String getNumberStandartChars(String a) {
        try{
            char[] charList = a.toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            char charItem = 0;
            for (int i = 0; i < charList.length; i++) {
                charItem  = charList[i];
                if (charItem >= '\u0030' && charItem <= '\u0039' || charItem >= '\u0061' && charItem <= '\u007A'
                        || charItem >= '\u0430' && charItem <= '\u044F') {
                    stringBuilder.append(charItem);
                }
                if (charItem >= '\u0041' && charItem <= '\u005A' || charItem >= '\u0410' && charItem <= '\u042F') {
                    stringBuilder.append(Character.toLowerCase(charItem));
                }
            }
            return stringBuilder.toString();
        }
        catch (NullPointerException e) {
            return "";
        }
    }



    public static void main(String[] args) {
        String n = "heLloж";
        System.out.println(getNumberStandartChars(n));
    }
}

