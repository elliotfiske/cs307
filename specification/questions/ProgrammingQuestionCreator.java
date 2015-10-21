package questions;

import java.util.Collection;

/**
 * ProgrammingQuestionCreator adds a few components to QuestionCreator to 
 * accomodate for programming questions.
 *
 * The code component holds the programming code that will be compiled. The
 * testCases component holds the list of TestCases that will be used to test
 * the program. The curTestCase component holds the index of the currently
 * selected test case in the testCases component.
 *
 * The operations include adding input fields, adding test cases, editing
 * test cases, and removing test cases.
 */
public abstract class ProgrammingQuestionCreator extends QuestionCreator {
   public ProgrammingCode code;
   public Collection<TestCase> testCases;
   public int curTestCase;

   /**
    * AddInputField inserts an input field into the code component.
    * This lets students input their own code into the code component.
    */
   public abstract void addInputField();

   /**
    * AddNewTestCase opens an empty TestCase dialog.
    * This new test case is added to the end of the testCases list.
    */
   public abstract void addNewTestCase();

   /**
    * EditTestCase opens a filled or partially filled TestCase dialog.
    * This opens a test case from the testCases component to edit. The
    * test case that is chosen depends on the curTestCase component.
    */ 
   public abstract void editTestCase();

   /**
    * RemoveTestCase removes a test case from the testCases component.
    * The test case that is removed from the testCases component is located 
    * at the index designated by the curTestCase component. If the removed 
    * test case is not located at the last index of the list, then the list
    * shifts towards the 0th index.
    */ 
   public abstract void removeTestCase();
}
