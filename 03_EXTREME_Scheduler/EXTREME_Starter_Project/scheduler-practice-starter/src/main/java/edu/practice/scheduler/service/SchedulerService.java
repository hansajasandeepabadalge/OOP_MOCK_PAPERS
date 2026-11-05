package edu.practice.scheduler.service;
import edu.practice.scheduler.model.*;import edu.practice.scheduler.dto.*;import edu.practice.scheduler.repo.*;import edu.practice.scheduler.error.*;
import org.springframework.stereotype.Service;import java.util.*;
@Service public class SchedulerService {
 private final WorkloadRepository repo;
 public SchedulerService(WorkloadRepository repo){this.repo=repo;}
 public Collection<Workload> all(){return repo.all();}
 public int urgency(long id,int nowTick){
  // TODO Task 2: return urgency of a given job, or WorkloadNotFoundException.
  throw new UnsupportedOperationException("Task 2");
 }
 public List<Workload> ranked(int nowTick){
  // TODO Task 2: dynamic urgency DESC, then ID ASC.
  throw new UnsupportedOperationException("Task 2");
 }
 // TODO Task 3: retain confirmed reservations, implement preview with a deterministic
 // earliest-feasible-slot algorithm subject to release, deadline, CPU, memory and horizon.
 // TODO Task 4: commit with runKey idempotency and conflict detection (HTTP 409).
 public synchronized List<Reservation> reservations(){throw new UnsupportedOperationException("Task 4");}
 public synchronized SchedulePlan preview(PlanRequest request){throw new UnsupportedOperationException("Task 3");}
 public synchronized SchedulePlan commit(CommitRequest request){throw new UnsupportedOperationException("Task 4");}
}
