package ie.tudublin;

import java.util.ArrayList;

public class Word {

    ArrayList<Follow> words = new ArrayList<Follow>();

    public Word() {

    }

    public void addWord(String word) {

        int last = words.lastIndexOf(words);

        if (words.isEmpty()) {
            Follow f = new Follow(word);
            words.add(f);
        }

        for (Follow fs : words) {

            if (fs.word == word) {
                fs.count++;
                break;
            }

            int current = words.indexOf(fs);

            System.out.println(last);

            if (fs.word != word) {

                if (last == current) {
                    Follow f = new Follow(word);
                    words.add(f);

                }

                continue;
            }

        }
    }

}

// for (Follow fs : words) {

// if(fs.word != word){
// continue;
// }
// if(fs.word == word){
// fs.count++;
// break;
// }

// }
// else {
// Follow f = new Follow(word);
// words.add(f);
// }

// if (words.contains(word)) {
// int s = words.indexOf(word);

// } else {
// Follow f = new Follow(word);
// words.add(f);
// }

// }
