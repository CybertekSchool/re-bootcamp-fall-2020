public class StringMethods {

    public static void main(String[] args) {
        System.out.println(freqOfChar("bananana", 'a'));
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



}
