package edu.practice.scheduler.error;
public class CommitConflictException extends RuntimeException {
 public CommitConflictException(String runKey){super("runKey already used with different inputs: "+runKey);}
}
