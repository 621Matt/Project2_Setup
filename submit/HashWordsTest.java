import org.junit.*;
import static org.junit.Assert.*;

/**
 * Description
 */
public class HashWordsTest {
    // Object to be tested
    private HashWords runner;

    /**
     * setup() method, runs before each test method below.
     * Use this method to recreate the objects needed for
     * testing your class.
     */
    @Before
    public void setup() {
        runner = new HashWords(10);
    }

    /**
     * testOne() testing size()
     */
    @Test
    public void testOne() {
        assertEquals("Size of table is wrong",
                10, runner.size());
    }

    //testing hashkey()
    @Test
    public void testTwo() {
        assertEquals(runner.hashKey("hello"), 2);
        assertEquals(runner.hashKey("HELLO"), 2);
    }

    //testing frequency
    @Test
    public void testThree() {

    }
    
    //testing addWord
    @Test
    public void testFour() {
        runner.addWord("test");
        
        assertTrue(runner.contains("test"));

        runner.addWord("test");

        //int index = runner.hashKey("test");

        //assertEquals(, 2);

    }
    
    //testing reSize
    @Test
    public void testFive() {
        //Comparing size and hashvalue before resize
        assertEquals(runner.size(), 10);
        assertEquals(runner.hashKey("Hello"), 2);

        runner.reSize();

        //comparing size and hashvalue after resize
        assertEquals(runner.size(), 30);
        assertEquals(runner.hashKey("Hello"), 22);

        //Adding element, resizing and seeing if element is still present in array
        runner.addWord("Hello");
        runner.reSize();
        assertNotNull(runner.contains("Hello"));
    }

    //testing contains
    @Test
    public void testSix() {
        runner.addWord("Hello");
        assertTrue(runner.contains("Hello"));
        assertFalse(runner.contains("Hi"));

        runner.reSize();
        assertTrue(runner.contains("Hello"));
    }
    
    //testing numUniqueWordsInTable
    @Test
    public void testSeven() {

    }
    
    //testing totalNumOfWords
    @Test
    public void testEight() {

    }
    
    //testing mostCommonWord
    @Test
    public void testNine() {

    }
    
    //testing termFrequency
    @Test
    public void testTen() {

    }
    
}
