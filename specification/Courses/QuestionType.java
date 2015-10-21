
package QuestionDB;

/*
 *
 * This file defines the Question Type object, which can be thought of as
 * a collection of questions that are on the same topic (ex. X + 5 = 10, X^2 = 64,
 * both questions are related to Solving For X, yet are different implementations).
 *
 *
 */

import java.util.Collection;
import Questions.QuestionCreator;
/**
 * A QuestionType contains a collection of questions that share the same concept, yet
 * may have different implementations. For example, you could have 5 different questions
 * that all practice the concept of Solving for X, but an instructor might want to randomly
 * select a question from this concept for a new test, rather than reusing an old question.
 */
abstract class QuestionType {
    String description;
    Collection<QuestionCreator> qCreators;

    /**
     * Uses the selected QuestionCreator to edit the question.
     */
    public abstract void editQuestion();

    /**
     * Selects a question to be used for edits or deletes.
     */
    public abstract void selectQuestion();

    /**
     * Deletes a question from the collection.
     */
    public abstract void deleteQuestion();
}
