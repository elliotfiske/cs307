package users;

import tests.Test;
import grades.TestGraded;


/**
 * Represents a student user in Test Tool. Has associations between a student
 * and their courses, tests, and grades.
 *
 * @author Max Linsenbard
 */
public abstract class Student {
	public ArrayList<Test> tests;
	public ArrayList<Course> courses;
	public ArrayList<TestGraded> grades;

	/**
	 * The constructor for a student object
	 *
	 * @return the Student object
	 */
	public abstract Student();

	/**
	 * Adds the specified test to the student's test bank
	 *
	 * @param the test to be added
	 */
	public abstract void addTest(Test t);

	/**
	 * Removes the specified test from the student's test bank
	 *
	 * @param the test to be removed
	 */
	public abstract void removeTest(Test t);

	/**
	 * Adds the specified course to the student's course list
	 *
	 * @param the course to be added
	 */
	public abstract void addCourse(Course c);

	/**
	 * Removes the specified course from the student's course list
	 *
	 * @param the course to be removed
	 */
	public abstract void removeCourse(Course c);

	/**
	 * Adds the specified grade to the student's grade book
	 *
	 * @param the grade to be added
	 */
	public abstract void addGrade(TestGraded g);

	/**
	 * Removes the specified grade from the student's grade book
	 *
	 * @param the grade to be removed
	 */
	public abstract void removeGrade(TestGraded g);
}
