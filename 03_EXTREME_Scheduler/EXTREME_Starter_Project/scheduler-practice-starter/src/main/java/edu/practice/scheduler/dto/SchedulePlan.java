package edu.practice.scheduler.dto;
import java.util.List;
public record SchedulePlan(int nowTick,int horizon,List<Reservation> selected,List<Rejection> rejected){}
