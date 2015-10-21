package Tests;

/**
 * pane that confirms a users delete selection
 */
public abstract class DeletePane extends RightPane {
   /**
    * Cancels delete and closes pane
    */ 
   public abstract void cancelDelete();

   /**
    *  Confirms delete selection
    */ 
   public abstract void yesDelete();
}
