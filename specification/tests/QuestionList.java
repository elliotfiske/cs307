package Tests;

import java.util.Collection;

/**
 * Holds a collection of questions that the user can select and sort
 */
public abstract class QuestionList {
   Collection<Question> questions;
   QuestionSortOrder sortOrder;
   Question selectedQuestion;   

   public abstract void sortQuestions(QuestionSortOrder sort);
}
