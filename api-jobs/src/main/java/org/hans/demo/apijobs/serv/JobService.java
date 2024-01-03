package org.hans.demo.apijobs.serv;

import org.hans.demo.apijobs.job.JobPosition;

import java.util.List;

public interface JobService {

    List<JobPosition> getJobs (String description, String location, int page, boolean fullTime);

}
