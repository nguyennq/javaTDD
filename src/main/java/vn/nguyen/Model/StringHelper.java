package vn.nguyen.Model;

/**
 * Created by nals on 3/21/18.
 */
public class StringHelper {
    public String swapLast2Chars(String text) {
//      swap  BA = AB
        char firstChar = text.charAt(0);
        char secondChar = text.charAt(1);
        return "" + secondChar + firstChar;
    }
}
