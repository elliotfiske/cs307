package Tests;

public enum Status{
   OPEN, LOCKED, INPROGRESS
}

public abstract class Test {
   String title;
   String lastRevision;
   String course;
   int timeLimitMins;
   String description;
}
