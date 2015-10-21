
package QuestionDB;

import java.util.Collection;

/**
 * The Section class can be thought of as a smaller collection of types questions, relevant to a specific 
 * topic or idea.
 */
public abstract class Section {
    public String name;
    public int chapter;
    public QuestionTypeCreator creator;
}
