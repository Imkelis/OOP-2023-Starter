package ie.tudublin;

import java.util.ArrayList;

public class Word {
    int count;

    ArrayList<Follow> words = new ArrayList<Follow>();

    public Word() {

        this.count = -1;

    }

    public Follow findWord(String word) {

        for (Follow fs : words) {

            if (fs.word == word) {
                System.out.println("test");
                System.out.println(word);
                return fs;
            }

        }
        return null;
    }

    public void printModel() {

        for (Follow fs : words) {

            System.out.println(fs.word + "(" + fs.count + ")");

        }
    }

    public void addWord(String word) {

        if (findWord(word) == null) {

            Follow f = new Follow(word);
            words.add(f);

        } else {

            Follow wo = findWord(word);
            wo.count = wo.count + 1;
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
