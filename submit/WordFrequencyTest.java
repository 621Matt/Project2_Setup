import org.junit.*;
import static org.junit.Assert.*;

/**
 * Description
 */
public class WordFrequencyTest {
    // Object to be tested
    private WordFrequency runner;
    //private String runner2;

    /**
     * setup() method, runs before each test method below.
     * Use this method to recreate the objects needed for
     * testing your class.
     */
    @Before
    public void setup() {
        runner = new WordFrequency("Hello");
        //runner2 = "Hello";
    }

    /**
     * testOne() testing something
     */
    @Test
    public void testOne() {
        assertEquals("Word stored is wrong", "Hello", runner.getWord());
    }

    @Test
    public void testTwo() {
        assertEquals("Count stored is wrong", 1, runner.getCount());
    }

    @Test
    public void testThree() {
        assertEquals("Count is correct", 1, runner.getCount());
        runner.increment();
        assertEquals("Count is increased", 2, runner.getCount());
    }

    @Test
    public void testFour() {
        WordFrequency w = new WordFrequency("hello");

        assertTrue(runner.equals("hello"));
        assertTrue(runner.equals(w));
        assertTrue(runner.equals(runner));
    }
}
