package Grades;
/*
 * Holds information about the graded infor of a students test
 * Keeps track of the points possible on the test
 * The points earned by the studen
 * The amoint of points given via curve
 * and a char representation of the grade
 */
public abstract class TestGraded extends Test {
   int possiblePoints;
   int pointsEarned;
   int curve;
   char grade;
}
