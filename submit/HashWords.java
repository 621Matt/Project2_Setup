import itsc2214.*; // not needed now, but you might in your projects

/**
 * Description
 */
public class HashWords {
    /**
     * Description
     */
    private WordFrequency[] table;
    private int initialSize;
    private int count;

    public HashWords(int initialSize) 
    {
        // TODO put code here
        this.initialSize = initialSize;
        this.count = 0;

        table = new WordFrequency[initialSize];
    }

    /**
     * Description
     */
    public int size() {
        // TODO change this
        return initialSize;
    }

    /**
     * Returns index of string using its hashvalue
     */
    public int hashKey(String w) {
        // TODO change this
        int key = 0;
        for (int i = 0; i < w.length(); i++) {
            key += w.toLowerCase().charAt(i);
        }
        return key % initialSize;
    }
    
    /**
     * Description
     */
    public int frequency(String w) {
        // TODO change this
        return 0; 
    }

    /**
     * Description REDO THIS METHOD
     * 1. get index of w using hashKey
     * 2.check to see if word already exists in table, increment if so
     * 3.if not, check for space in table, use linear probing to move values 
     * 4.if no space, grow the arraylist and rehash words, add them back into table (new size is times 3)
     * 5.finally after growing add w into table
     */
    public void addWord(String w) {
        // TODO put code here
        int index = hashKey(w);

        //Checking to see if w is in table //BIG CHANGES WERE HERE prevents increments of words that appear once like provide
        if (contains(w)) {
            if(table[index] != null){
                table[index].increment();
                return;
            }
//            while (table[index] != null) {
//                if (table[index].getWord().equals(w)) {
//                    table[index].increment();
//                    return;
//                }
//                index = (index + 1) % initialSize;
//            }
        }

        //checking spaces
        for (int i = 0; i < initialSize; i++) {
            index = (hashKey(w) + i) % initialSize;
            if (table[index] == null) { //space empty
                table[index] = new WordFrequency(w);
                count++;
                return;
            }
            if (count >= initialSize) {
                reSize();
            }
        }

//
//        if (count >= initialSize) {
//            reSize();
//            addWord(w);
//
//        }
    }

//resizes array by creating a new array with old values and calling the addword method
//will rehash the words
public void reSize() {
    initialSize *= 3;
    WordFrequency[] temp = new WordFrequency[initialSize];
    int newIndex = 0;

    //goes over old table and rehashes values then adds to new array
    int i = 0;
    for (WordFrequency oldWord : table) {
        if(oldWord == null){ //skips word if null
            continue;
        }

        if(temp[newIndex] != null){ //extra code
            newIndex = (hashKey(oldWord.getWord()) + 1) % initialSize;
        }

        newIndex = hashKey(oldWord.getWord());
        temp[newIndex] = oldWord;
    }
    table = temp;
}


    /**
     * Description
     */
    public boolean contains(String w) {
        for (WordFrequency word : table) {
            if (word == null) { //skips if null
                continue;
            }

            if (word.getWord().equals(w)) { //checks word
                return true;
            }
        }
        return false; //word not found
    }
    /**
     * Description
     */
    public int numUniqueWordsInTable() {
        // TODO change this
        return 0;
    }

    /**
     * Description
     */
    public int totalNumOfWords() {
        // TODO change this
        int total = 0;
        for(WordFrequency word : table){
            if(word == null){
                continue;
            }
            total += word.getCount();
        }
        return total;
    }

    /**
     * Description
     */
    public String mostCommonWord() {
        // int hCount = 0;
        // for (WordFrequency word : table) {
        //     if (word == null) {
        //         continue;
        //     }
        //         if (word.getCount() > hCount) {
        //             hCount = word.getCount();
        //         }
        //         if (word.getCount() == hCount) {
        //             return word.getWord();
        //         }
            
        // }
        return null;
    }

    /**
     * Description
     */
    public double termFrequency(String w) {
        // TODO change this
        return 0.0;
    }
}
