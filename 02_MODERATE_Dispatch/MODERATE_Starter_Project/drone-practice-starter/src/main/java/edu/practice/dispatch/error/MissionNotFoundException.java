package edu.practice.dispatch.error;
public class MissionNotFoundException extends RuntimeException {
 public MissionNotFoundException(long id){super("Mission not found: "+id);}
}
