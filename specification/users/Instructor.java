package users;

import courses.Course;
import tests.TestGraded;
import java.util.ArrayList;

/**
 * Represents a instructor user in Test Tool. Has associations between an
 * instructor and their courses, tests, and students.
 *
 * @author Max Linsenbard
 */
public abstract class Instructor {
	public ArrayList<TestGraded> tests;
	public ArrayList<Course> courses;
	public ArrayList<Student> students;

	/**
	 * The constructor for a instructor object
	 *
	 * @return the Instructor object
	 */
	public abstract Instructor();

	/**
	 * Adds the specified test to the instructor's test bank
	 *
	 * @param the test to be added
	 */
	public abstract void addTest(TestGraded t);

	/**
	 * Removes the specified test from the instructor's test bank
	 *
	 * @param the test to be removed
	 */
	public abstract void removeTest(TestGraded t);

	/**
	 * Adds the specified course to the instructor's course list
	 *
	 * @param the course to be added
	 */
	public abstract void addCourse(Course c);

	/**
	 * Removes the specified course from the insturctor's course list
	 *
	 * @param the course to be removed
	 */
	public abstract void removeCourse(Course c);

	/**
	 * Adds the specified student to the inctructor's student list
	 *
	 * @param the student to be added
	 */
	public abstract void addStudent(Student s);

	/**
	 * Removes the specified student from the instructor's student list
	 *
	 * @param the student to be removed
	 */
	public abstract void removeStudent(Student s);
}
