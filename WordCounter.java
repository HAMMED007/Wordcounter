package wordcounter.home;

public class WordCounter {


    void count(String counter) {
        int countspace = 0;
        int characterCount = 0;
        counter = counter.trim();
        for (int i = 0; i < counter.length(); i++) {

            String store = String.valueOf(counter.charAt(i));

            characterCount++;
            if (store.equals(" ")) {

                countspace++;


            }
        }
        int words_count = countspace + (1);
        int characters_count = Math.subtractExact(characterCount, countspace);
        counter = counter.toUpperCase();
        System.out.println(" The String " + counter + " contains " + words_count +
                " words and " + characters_count + " character ");
    }

}



