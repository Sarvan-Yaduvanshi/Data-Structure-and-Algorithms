package STRING;
import java.util.*;
public class Compression1 {
    public static String Comprimir(String texto){

        StringBuilder objString = new StringBuilder();

        int count;
        char match;

        count = texto.substring(texto.indexOf(texto.charAt(1)), texto.lastIndexOf(texto.charAt(1))).length()+1;
        match = texto.charAt(1);
        objString.append(count);
        objString.append(match);

        return objString.toString();
    }
    public static void main(String[] args) {
        String str = "AABBSDDFFFGGG";
        System.out.println(Comprimir(str));
    }

}
