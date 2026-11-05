package edu.practice.scheduler.dto;
public record PlanRequest(int nowTick,int horizon,int cpuCapacity,int memoryCapacity){}
