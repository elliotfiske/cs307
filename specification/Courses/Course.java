
package QuestionDB;

import java.util.Collection;
/**
 * The "Question Database" for our testtool is represented in terms of Courses, which contain Sections.
 * The Course class is made to be a collection of smaller sections which contain questions relevant
 * to that section.
 */
public abstract class Course {
    public String name;
    public SectionCreator creator;
}
