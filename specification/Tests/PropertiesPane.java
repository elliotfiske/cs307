package Tests;

/**
 * Lets the user adjust basic test info
 */
public abstract class PropertiesPane extends RightPane {
   String title;
   String course;
   int timeLimit;
   String description;

   /**
    * Saves all the properties to the current test
    */  
   public abstract void saveButton();

   /**
    *   Closes pane without saving
    */ 
   public abstract void cancelButton();
}
