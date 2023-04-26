package ie.tudublin;

public class Follow {

    int count;
    String word;

    public Follow(String word) {

        this.word = word;
        this.count = 1;
        // System.out.print(word);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

}
