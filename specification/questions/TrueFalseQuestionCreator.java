package questions;

/**
 * TrueFalseQuestionCreator adds a component and an operation to accomodate
 * for true/false questions.
 *
 * The answer component holds either true or false, since the answers are
 * limited to those values. 
 *
 * It has one operation to change the answer.
 */
public abstract class TrueFalseQuestionCreator extends QuestionCreator {
   public boolean answer;
   
   /**
    * ChooseAnswer changes which answer is correct.
    * It changes the value in the answer component from true to false
    * or from false to true.
    */
   public abstract void chooseAnswer();
}
