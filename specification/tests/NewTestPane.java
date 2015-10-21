package tests;
/**
 * The initial pane for making a test, lets the teach set basic
 * information such as time limit, name, course, etc.
 */
public abstract class NewTestPane extends RightPane {

   String title;
   String course;
   int timeLimit;
   String description;

   /**
    * adds the test to the test list and opens the basic generator
    */ 
   public abstract void generateTest();
   /**
    * Cancels the generation and closes the pane
    */ 
   public abstract void cancelGenerateTest();
   /**
    * Updates the currTest info
    */ 
   public abstract void updateTestInfo();
}
