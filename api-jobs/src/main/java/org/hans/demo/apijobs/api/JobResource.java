package org.hans.demo.apijobs.api;

import org.hans.demo.apijobs.serv.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/jobs")
public class JobResource {

    @Autowired
    private JobService jobService;

    @GetMapping("")
    public ResponseEntity<?> getJobsPositions (
            @RequestParam(defaultValue = "") String description,
            @RequestParam(defaultValue = "") String location,
            @RequestParam(defaultValue =  "0") int page,
            @RequestParam(defaultValue = "false") Boolean fullTime
    ) {
        return ResponseEntity.ok(jobService.getJobs(description, location, page, fullTime));
    }

}
