package questions;

import java.util.Collection;

/**
 * A QuestionCreator is the generic definition for the Creator screens. 
 *
 * The question component holds the question that is inputted. The 
 * difficulty component holds the question's difficulty. The 
 * questionType component contains the type of question that is
 * currently selected. 
 *
 * The operations include saving the question 
 * data to the question bank, changing the difficulty, changing the
 * question type, and closing the Question Creator.
 */
public abstract class QuestionCreator {
   public String question;
   public Difficulty difficulty;
   public QuestionType questionType;

   /**
    * SaveQuestion stores all of the data entered in the Question Creator 
    * into a single question in the question bank.
    * This also closes the Question Creator dialog.
    */
   public abstract void saveQuestion();
   
   /**
    * ChangeDifficulty adjusts the difficulty component of the question.
    * This can be changed into Easy, Medium, or Hard.
    */
   public abstract void changeDifficulty();

   /**
    * ChangeQuestionType changes the type of question that is being created.
    * This can be changed into Multiple Choice, True/False, Multiple 
    * Reponse, Short Answer, or Programming. The Question Creator dialog
    * visually changes according to what type of question it is.
    */
   public abstract void changeQuestionType();

   /**
    * Close exits the Question Creator.
    * This does not save any changes made to the question.
    */
   public abstract void close();
}
