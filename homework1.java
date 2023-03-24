import java.util.Arrays;

public class homework1 {


    /**
     * Write a function called concatenate
     * - It should take an array of strings and concatenate them in a sentence while placing space in between words.
     * - Don't forget to put a period at the end of the sentence.
     * - Don't forget to make uppercase the first word in the sentence.
     */

        public static void main(String[] args) {
            String a= ".";
            String[] stringArray = {
                    "greetings", "this","is", "an", "array", "of", "strings",
                    "and", "your", "goal", "is", "to", "concatenate", "all",
                    "in", "a", "sentence"};
            String toplam =Arrays.toString(stringArray);
            toplam = toplam.replaceAll(",", "");

            String toplam1 = toplam + a;
            toplam1 = toplam1.replaceAll(", |\\[|\\]", "");
            String cumle = toplam1.substring(0, 1).toUpperCase() + toplam1.substring(1);
            System.out.println("Cümleniz:" + cumle);

        }

        static String concatenate(String[] strings) {

            String string= "cümle";
            return string;

        }


}
