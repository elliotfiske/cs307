package Questions;

import java.util.Collection;

/**
 * MultChoiceQuestionCreator adds a few components to QuestionCreator
 * to accomodate for multiple choice questions.
 *
 * The answers component stores the series of possible choices that
 * the multiple choice question offers. The correctAnswer component
 * holds the index of the correct answer in the answers component.
 *
 * The operations include choosing a new correct answer, adding a 
 * new possible answer, and removing a possible answer.
 */
public abstract class MultChoiceQuestionCreator extends QuestionCreator {
   public Collection<String> answers;
   public int correctAnswer;

   /**
    * ChooseAnswer changes which answer in the answers component
    * is correct.
    * It does this by changing the index that correctAnswer refers to.
    */
   public abstract void chooseAnswer();
   
   /**
    * AddNewChoice adds a new choice to the list of possible answers.
    * It adds a new entry to the answers component, located at the end
    * of the list.
    */
   public abstract void addNewChoice();

   /**
    * RemoveChoice removes the last choice in the list of possible answers.
    * It removes the last entry in the answer component. If correctAnswer
    * is referring to that entry, it will reset to refer to the first 
    * answer.
    */
   public abstract void removeChoice();
}
