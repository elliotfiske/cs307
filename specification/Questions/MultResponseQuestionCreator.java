package Questions;

import java.util.Collection;

/**
 * MultResponseQuestionCreator adds a few components to QuestionCreator
 * to accomodate for multiple response questions.
 *
 * The answers component stores the series of possible choices that the
 * multiple response question offers. The correctAnswer component is a 
 * list of boolean values that indicates which values in the answers
 * component are correct. Each value in the correctAnswer component
 * corresponds to the value in the answers component at the same index.
 * The answers component and the correctAnswers component must be the 
 * same size.
 * 
 * The operations include choosing a new correct answer, adding a new 
 * possible answer, and removing a possible answer.
 */
public abstract class MultResponseQuestionCreator extends QuestionCreator {
   public Collection<String> answers;
   public Collection<Boolean> correctAnswers;
   
   /**
    * ChooseAnswer toggles the correctness of answers in the answer 
    * component.
    * It changes the value in the correctAnswers component from true to
    * false and vice versa.
    */
   public abstract void chooseAnswer();

   /**
    * AddNewChoice adds a new choice to the list of possible answers.
    * It adds a new entry to both the answers and correctAnswers components.
    * These new entries are added to the ends of the lists.
    */
   public abstract void addNewChoice();

   /**
    * RemoveChoice removes the last choice in the list of possible answers.
    * It removes the last entries in both the answers and correctAnswers
    * components.
    */
   public abstract void removeChoice();
}
