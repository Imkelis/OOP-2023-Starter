package ie.tudublin;

import java.util.ArrayList;

public class Word {
    int count = -1;

    ArrayList<Follow> words = new ArrayList<Follow>();

    public Word() {

    }

    public boolean findWord(String word) {

        for (Follow fs : words) {

            if (fs.word == word) {
                return true;
            }

        }
        return false;
    }

    public void printModel() {

        for (Follow fs : words) {

            System.out.println(fs.word + "(" + fs.count + ")");

        }
    }

    public void addWord(String word) {

        if (words.isEmpty()) {

            Follow f = new Follow(word);
            words.add(f);

        }

        if (findWord(word) == false) {

            Follow f = new Follow(word);
            words.add(f);
            // f.count++;

        } else {

            for (Follow fs : words) {
                if (fs.word == word) {
                    fs.count++;
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

// if (words.isEmpty()) {
// Follow f = new Follow(word);
// words.add(f);
// count++;
// }

// for (Follow fs : words) {

// int current = words.indexOf(fs);

// if (count == current && fs.word != word) {
// Follow f = new Follow(word);
// words.add(f);
// count++;
// // System.out.print("test");
// break;

// }

// if (fs.word == word) {
// System.out.println(fs.word + word);
// fs.count++;
// }

// }
