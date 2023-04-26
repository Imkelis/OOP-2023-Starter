package ie.tudublin;

import java.util.ArrayList;

public class Word {

    ArrayList<String> words = new ArrayList<String>();

    public Word() {

    }

    public void addWord(String word) {

        if (words.contains(word)) {

        } else {
            words.add(word);
        }
        System.out.println(words);

    }

}
