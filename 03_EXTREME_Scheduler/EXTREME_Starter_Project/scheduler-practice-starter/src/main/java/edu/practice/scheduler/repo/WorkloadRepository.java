package edu.practice.scheduler.repo;
import edu.practice.scheduler.model.*;import java.util.*;import java.util.concurrent.*;
import org.springframework.stereotype.Repository;
@Repository public class WorkloadRepository {
 private final Map<Long,Workload> map=new ConcurrentHashMap<>();
 public WorkloadRepository(){
  map.put(1L,new BatchWorkload(1,2,4000,3,0));
  map.put(3L,new BatchWorkload(3,2,2000,2,1));
  // TODO after Task 2: add DeadlineWorkload(2,4,6000,2,0,4) and
  // DeadlineWorkload(4,3,6000,3,1,6).
 }
 public Collection<Workload> all(){return List.copyOf(map.values());}
 public Workload find(long id){return map.get(id);}
}
