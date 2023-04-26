package ie.tudublin;

import java.util.ArrayList;

public class Word {
    int count;

    ArrayList<Follow> words = new ArrayList<Follow>();

    public Word() {

        this.count = -1;

    }

    //// This was suppoed to find the duplicated words. Doesnt work as it doesnt
    //// detect anyything as a duplicate.
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

    //////// I couldnt get this to correctly add the words. It for some reason
    //////// couldnt detect duplicates.
    public void addWord(String word) {

        if (findWord(word) == null) {

            Follow f = new Follow(word);
            words.add(f);

        } else {

            Follow wo = findWord(word);
            wo.count = wo.count + 1;
        }

    }

    @Override
    public String toString() {
        return "Word [count=" + count + ", words=" + words + "]";
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
