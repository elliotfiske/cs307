package Tests;

/**
 * Lets user make manual changes to test question directory
 */
public abstract class FinalChangesPane extends RightPane {
   int numQuestions;
   boolean randomize;

   /**
    * Go back to simple generator
    */  
   public abstract void regenerate();

   /**
    *   Closes pane without saving
    */ 
   public abstract void cancel();
   
   /**
    *   Save changes to test questions
    */ 
   public abstract void save();
}
