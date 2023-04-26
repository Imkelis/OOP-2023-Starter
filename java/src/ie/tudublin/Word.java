package ie.tudublin;

import java.util.ArrayList;

public class Word {
    int count = -1;

    ArrayList<Follow> words = new ArrayList<Follow>();

    public Word() {

    }

    public void addWord(String word) {

        if (words.isEmpty()) {
            Follow f = new Follow(word);
            words.add(f);
            count++;
        }

        for (Follow fs : words) {

            if (fs.word == word) {
                fs.count++;
                break;
            }

            int current = words.indexOf(fs);

            if (fs.word != word) {

                if (count == current) {
                    Follow f = new Follow(word);
                    words.add(f);
                    count++;
                    System.out.println(f.word);
                    break;

                }
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
