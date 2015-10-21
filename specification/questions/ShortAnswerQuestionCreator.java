package questions;

import java.util.Collection;

/**
 * ShortAnswerQuestionCreator adds a few components to QuestionCreator
 * to accomodate for short answer questions.
 *
 * The newAnswer component stores the new answer that the user will add 
 * to the list of correct answers. The answers component is a list of all
 * correct answers for this question. The selectedAnswer component holds the
 * index of the currently selected answer from the list.
 *
 * The operations include adding new answers to the list, selecting answers
 * from the list, editing answers, removing individual answers, and removing
 * every answer.
 */
public abstract class ShortAnswerQuestionCreator extends QuestionCreator {
   public String newAnswer;
   public Collection<String> answers;
   public int selectedAnswer;

   /**
    * AddNewAnswer adds the answer in the newAnswer component to the 
    * answers component.
    * The new answer is appended to the end of the answers list.
    */
   public abstract void addNewAnswer();

   /**
    * SelectAnswer changes which answer in the list is currently highlighted.
    * This changes the selectedAnswer component to match the index of the 
    * highlighted value in the answers component.
    */
   public abstract void selectAnswer();

   /**
    * EditAnswer allows for an answer in the answers component to be edited.
    * The String of the currently selected answer can be changed. The 
    * currently selected answer is determined by the selectedAnswer component.
    */
   public abstract void editAnswer();

   /**
    * RemoveAnswer removes an individual answer from the answers component.
    * This removes the currently selected answer from the answer component.
    * The currently selected answer is determined by the selectedAnswer
    * component. If the removed answer is not located at the last index of
    * the answers component, then the list shifts towards the 0th index.
    */
   public abstract void removeAnswer();

   /**
    * RemoveAll removes every answer from the answers component.
    * This clears the list in the answers component.
    */
   public abstract void removeAll();
}
