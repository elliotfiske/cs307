package grades;

import java.util.Collection;

/**
 * Student contains information about about what
 * tests a stident has taken and what classes they
 * belong too.  Also provides a profile picture
 * to recognize the stident with.
 */
public abstract class Student {
   Collection<Test> takenTests;
   Collection<Section> enrolledClasses;
   Image profilePic;
}
