package grades;

/**
 *  This class containts all the information needed for grading
 *  a student's test
 */
public abstract class TestGradeView {
   Student student;
   TestGraded test;
   QuestionGraded currQuestion;
   String comment;
   int curve;
   boolean isInEdit;
   
   /**
    * Save all changes to questions and returns user to previous menu
    */  
   public abstract void doneAndClose();
   /**
    * Returns user to previous screen without saving
    */ 
   public abstract void cancelAndClose();
   /**
    * Scrolls to the previous question
    */ 
   public abstract void previousQuestion();
   /**
    * Scrolls to the next question
    */  
   public abstract void nextQuestion();
   /**
    * Toggles the user between comment and edit mode
    */  
   public abstract void toggleCommentEdit();
   /**
    * Changes if a question is right or wrong
    */  
   public abstract void markCorrectness(boolean isRight);

} 

