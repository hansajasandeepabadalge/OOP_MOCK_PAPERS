package edu.practice.scheduler.dto;
public record CommitRequest(String runKey,int nowTick,int horizon,int cpuCapacity,int memoryCapacity){
 public PlanRequest asPlanRequest(){return new PlanRequest(nowTick,horizon,cpuCapacity,memoryCapacity);}
}
