package tests;

import java.util.Collection;

/**
 * A right pane that lets the user publish a test
 */
public abstract class PublishPane extends RightPane {
   Collection<Student> students;

   /**
    * Lets a single student be added to the publish list
    */  
   public abstract void addStudent();

   /**
    * Adds a whole class to the publish list
    */ 
   public abstract void addClass();

   /**
    * removes a student from the list of test takers
    */
   public abstract void removeStudent();

   /**
    * Cancels the publich process
    */  
   public abstract void cancelPublish();

   /**
    * Publishes the test to all the students in students collection
    */ 
   public abstract void publishTest();
}
