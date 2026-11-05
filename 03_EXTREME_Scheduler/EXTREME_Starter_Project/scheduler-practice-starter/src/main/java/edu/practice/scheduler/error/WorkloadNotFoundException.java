package edu.practice.scheduler.error;
public class WorkloadNotFoundException extends RuntimeException {
 public WorkloadNotFoundException(long id){super("Workload not found: "+id);}
}
