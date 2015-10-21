package tests;
import java.util.Collection;

/**
 * Advanced options for test generator
 */
public abstract class AdvGenPane extends RightPane {
   int numQuestions;
   int possibleQuestions;
   boolean randomize;
   Difficulty EASY;
   Collection<String> formatFrequencies, difficultyFrequencies;

   /**
    * Move to the simple options pane
    */  
   public abstract void back(AdvGenPane keptSettings);
   
   /**
    *   Generate questions
    */ 
   public abstract void generate();
}
