package edu.practice.scheduler.controller;
import edu.practice.scheduler.service.*;import edu.practice.scheduler.model.*;import edu.practice.scheduler.dto.*;
import java.util.*;import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/workloads") public class SchedulerController {
 private final SchedulerService service;
 public SchedulerController(SchedulerService service){this.service=service;}
 @GetMapping public Collection<Workload> all(){return service.all();}
 // TODO Task 4: GET /{id}/urgency?nowTick=..., GET /ranked?nowTick=...,
 // POST /preview, POST /commit and GET /reservations. Keep controller thin.
}
