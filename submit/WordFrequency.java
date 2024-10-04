/**
 * WordFrequency class to be used in a hash table.
 * 
 * @author Eric M. Carter-Barkman
 */
public class WordFrequency {
    // declare private variables here
    private String word;
    private int count;

    /**
     * Description
     */
    public WordFrequency(String w) {
        // TODO change this
        this.word = w;
        this.count = 1;
    }

    /**
     * Description
     */
    public String getWord() {
        // TODO change this
        return word;
    }

    /**
     * Description
     */
    public int getCount() {
        // TODO change this
        return count;
    }

    /**
     * Description
     */
    public void increment() {
        // TODO change this
        count++;
    }

    /**
     * equals() - compares two WordFrequency objects
     * checking to see if they are the same. Equality
     * is defined by string matching ignoring case.
     * 
     * @param other object to compare against
     * @return true if this and other are equals, false otherwise
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (other instanceof String) {
            String w = (String) other;
            return getWord().equalsIgnoreCase(w);
        } else if (other instanceof WordFrequency) {
            WordFrequency wf = (WordFrequency) other;
            String w = wf.getWord();
            return getWord().equalsIgnoreCase(w);
        } else {
            return false;
        }
    }
}
