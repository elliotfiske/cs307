package QuestionDB;

import java.util.Collection;

/**
 * SectionCreator manages sections by adding new sections and deleting them.
 */


public abstract class SectionCreator {
    public Collection<Section> sections;
    public Course selectedSection;

    /**
     * Adds a new section to the collection.
     * Each section is added at the end of the collection of sections.
     */
    public abstract void addSection();

    /**
     * Stores the currently selected section to the selectedSection, to be
     * used when deleting or editing the selected Section.
     */
    public abstract void selectSection();
}
