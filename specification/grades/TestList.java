package Grades;

import java.util.Collection;

/**
 * Holds a collection of tests that the user can select and sort
 */
public abstract class TestList {
   Collection<Test> tests;
   TestSortOrder sortOrder;

   public abstract Test TestSelected();
   public abstract void sortTests(TestSortOrder sort);
}
