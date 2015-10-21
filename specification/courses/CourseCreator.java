package QuestionDB;

import java.util.Collection;

/**
 * CourseCreator manages courses by adding new courses,
 * deleting them, and storing/loading.
 */


public abstract class CourseCreator {
    public Collection<Course> courses;
    public Course selectedCourse;

    /**
     * Adds a new course to the collection.
     * Each course is added at the end of the collection of courses.
     */
    public abstract void addCourse();

    /**
     * Stores the currently selected course to the selectedCourse, to be
     * used when deleting or editing the selected course.
     */
    public abstract void selectCourse();

    /**
     * Saves the courses to a file.
     */
    public abstract void saveCourses();

    /**
     * Loads courses from a file.
     */
    public abstract void loadCourses();
}
