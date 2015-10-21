package QuestionDB;

import java.util.Collection;

/**
 * QuestionCreator manages question types by adding new question types and deleting them.
 */


public abstract class QuestionTypeCreator {
    public Collection<QuestionType> qtypes;
    public Course selectedQType;

    /**
     * Adds a new QuestionType to the collection.
     * Each QuestionType is added at the end of the collection.
     */
    public abstract void addQuestionType();

    /**
     * Stores the currently selected QuestionType to the selectedQType, to be
     * used when deleting or editing the selected QuestionType.
     */
    public abstract void selectQuestionType();


    /**
     * Deletes a question type from the collection.
     */
    public abstract void deleteQuestionType();
}
