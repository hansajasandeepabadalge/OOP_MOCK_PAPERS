package edu.practice.scheduler.model;
public class BatchWorkload extends Workload {
 public BatchWorkload(long id,int cpuCores,int memoryMb,int durationTicks,int releaseTick){
  super(id,cpuCores,memoryMb,durationTicks,releaseTick);
 }
 @Override public int urgencyAt(int nowTick){
  // TODO Task 1: urgency = 100 + 2*max(0,nowTick-releaseTick); reject negative nowTick.
  throw new UnsupportedOperationException("Task 1");
 }
 @Override public int latestStartTick(){// TODO Task 1: an ordinary batch workload has no additional deadline.
  throw new UnsupportedOperationException("Task 1");}
}
