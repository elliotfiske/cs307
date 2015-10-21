package tests;

/**
 * Shows an inprogress test
 */
public abstract class InProgressPane extends RightPane {
   /**
    *   Opens a pane to view submitted tests
    */ 
   public abstract void viewGradeSubmissions();

   /**
    * Halts the test and prevents more students from taking it
    */
   public abstract void stopTest();
}
