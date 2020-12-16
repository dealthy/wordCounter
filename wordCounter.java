public class wordCounter {
    public static int wordCount(String words) {
        
        int wordCount = 0;
 
        for (int letter = 0; letter < words.length(); letter++) {

            if (words.substring(letter, letter + 1 ).equals(" ") == true) {
                wordCount += 1;
            }
            //space appears, word count +1

        }
        return wordCount;
    }

    public static void main(String args[]) {
        String words = "This is your day, Bob.";
        System.out.println(wordCount(words)); //5
    }
}