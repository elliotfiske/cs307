package grades;

import users.Student;

/**
 *  The student directoy holds all data needed
 *  to look at students and their tests and the functions
 *  needed to edit the test grades
 */
public abstract class StudentDirectory {
   
   Section classSection;
   StudentList students;
   TestList studentTests;
   Test selectedTest;
   Student selectedStudent;

   /**
    * Edits selectedTest if not null
    */
   public abstract void edit();
   /**
    * Opens comment menu if selectedTest != NULL 
    */
   public abstract void comment();
   
   /**
    * Changes the currently selected student 
    */ 
   public abstract void selectStudent();
   /**
    * Changes currently selected test
    */ 
   public abstract void selectTest();
}
