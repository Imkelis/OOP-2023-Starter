package ie.tudublin;

public class Follow {

    int count;
    String word;

    // doesnt increase count

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

    @Override
    public String toString() {
        return "Follow [count=" + count + ", word=" + word + "]";
    }

}
