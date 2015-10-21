package tests;

/**
 * View pane that gives the user access to the basics of a test
 */
public abstract class GeneralPane extends RightPane {
   /**
    * Lets the user view the questions associated with a test
    */ 
   public abstract void questionsButton();

   /**
    *  Shows properties for the current test
    */  
   public abstract void propertiesButton();

   /**
    * Takes the user to a publish options panel
    */ 
   public abstract void publishButton();
}
