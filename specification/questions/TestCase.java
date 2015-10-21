package questions;

/**
 * TestCase is a definition for test cases to be used in testing programming
 * question code.
 *
 * The name component holds the name chosen for the test case. The input
 * component holds the data that will be inputted into the program when
 * testing it. The output component holds the data that will be compared
 * to the output of the program to test the program's correctness.
 */
public abstract class TestCase {
   public String name;
   public String input;
   public String output;
}
