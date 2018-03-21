package vn.nguyen.Model;

/**
 * Created by nals on 3/21/18.
 */
public class StringHelper {
    public String swapLast2Chars(String text) {
        //swap  BA = AB
//        char firstChar = text.charAt(0);
//        char secondChar = text.charAt(1);
//        return "" + secondChar + firstChar;
        //swap ABDC = ABCD
        int lengthOfText = text.length();
        String textMinusLast2Chars = text.substring(0,lengthOfText-2);
        char secondLastChar = text.charAt(lengthOfText - 2);
        char lastChar = text.charAt(lengthOfText - 1);
        return textMinusLast2Chars + lastChar + secondLastChar;
    }
}
