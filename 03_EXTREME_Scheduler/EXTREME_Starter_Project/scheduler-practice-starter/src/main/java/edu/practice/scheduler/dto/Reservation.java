package edu.practice.scheduler.dto;
public record Reservation(long id,int startTick,int endTickExclusive,int cpuCores,int memoryMb){}
