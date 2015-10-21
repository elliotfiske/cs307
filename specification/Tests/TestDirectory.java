package Tests;

/**
 * General directory for managing tests
 */
public abstract class TestDirectory {
   RightPane currentPane;
   TestList tests;
   Test currTest;

   /**
    * Opens a new screen for making  test
    */  
   public abstract void newTest();

   /**
    * Creates a duplicate of currTest and adds it to the list
    */ 
   public abstract void duplicateTest();

   /**
    * Locks an old test
    */ 
  public abstract void lockTest();

   /**
    * Opens up the pane to onfirm test delection
    *  of the currently selected test
    */  
   public abstract void deleteTest();
}
