public class StringMethods {

    public static void main(String[] args) {
        System.out.println(freqOfChar("bananana", 'z'));

        System.out.println();

        freqOfEachChar("aaapppple");
        System.out.println();

        System.out.println(getOnlyUniqueValues("aaaabbcdddefffg"));
    }

    // freqency of chars

    // String, char   -> return how many times the char appear in the String

    // ("java", 'a')  -> 2

    public static int freqOfChar (String word, char letter) {
        int count = 0;

        for(int i=0; i < word.length(); i++) {
            if(word.charAt(i)  == letter) {
                count++;
            }
        }
        return count;
    }

    // We want to print how many times each char appears
    // apple
        // a - 1
        // p - 2

    public static void freqOfEachChar (String str) {
        String checked = "";
        for(int i=0; i < str.length(); i++) {
            if(!checked.contains("" + str.charAt(i))) {
                int freq = freqOfChar(str, str.charAt(i));
                System.out.println(str.charAt(i) + " - " + freq);
                checked += str.charAt(i) + " ";
            }
        }

    }

    // Take a String and return only unique values
    // aaaabbcdddefffg -> ceg

    public static String getOnlyUniqueValues(String str) {

        String unique = "";

        for(int i = 0 ; i < str.length(); i++) {

            // if we didn't have freqOfChar declared
            // the nested loop would be here

            if(freqOfChar(str, str.charAt(i)) == 1) {
                unique += "" + str.charAt(i);
            }
        }

        return unique;
    }

}
