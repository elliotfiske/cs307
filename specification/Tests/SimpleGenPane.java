package Tests;

public enum Difficulty{
   EASY, MEDIUM, HARD
}

/**
 * Basic options for test generator
 */
public abstract class SimpleGenPane extends RightPane {
   int numQuestions;
   int possibleQuestions;
   boolean randomize;
   Difficulty EASY;
   Collection<String> formatFrequencies, difficultyFrequencies;

   /**
    * Move to the advanced options pane
    */  
   public abstract void advOptions(SimpleGenPane keptSettings);

   /**
    *   Closes pane without saving
    */ 
   public abstract void cancel();
   
   /**
    *   Generate questions
    */ 
   public abstract void generate();
}
