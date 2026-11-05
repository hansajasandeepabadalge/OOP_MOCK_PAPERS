package edu.practice.scheduler.model;
public abstract class Workload {
 private final long id;private final int cpuCores;private final int memoryMb;
 private final int durationTicks;private final int releaseTick;
 protected Workload(long id,int cpuCores,int memoryMb,int durationTicks,int releaseTick){
 this.id=id;this.cpuCores=cpuCores;this.memoryMb=memoryMb;this.durationTicks=durationTicks;this.releaseTick=releaseTick;}
 public long getId(){return id;}public int getCpuCores(){return cpuCores;}
 public int getMemoryMb(){return memoryMb;}public int getDurationTicks(){return durationTicks;}
 public int getReleaseTick(){return releaseTick;}
 public abstract int urgencyAt(int nowTick);
 public abstract int latestStartTick();
}
