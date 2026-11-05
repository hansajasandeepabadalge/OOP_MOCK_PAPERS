package edu.practice.dispatch.dto;
import java.util.List;
public record DispatchPlan(int capacity,int energyUsed,int energyRemaining,List<PlanLine> selected,List<Long> skipped){}
