package tests;

/**
 * A test's questions directory
 */
public abstract class TestQuestions {
   RightPane currentPane;
   Test currTest;
   QuestionList questions;

   /**
    * Adds a question to the question list
    */  
   public abstract void addQuestion();

   /**
    * Removes a question from the question list
    */ 
   public abstract void removeQuestion();

   /**
    * Moves selected test up in the question order
    */ 
  public abstract void moveUp();

   /**
    * Moves selected test up in the question order
    */ 
  public abstract void moveDown();
}
