package grades;

import java.util.Collection;
import users.student;

/**
 *  Holds a sorted collection of students.  Sort order can be changed
 *  and students can be selected to display info
 */
public abstract class StudentList {
   Collection<Student> students;
   StudentSortOrder sortOrder;

   public abstract Student studentSelected();
   public abstract void sortStudents(StudentSortOrder sort);
}
