package org.hans.demo.apijobs.repo;

import org.hans.demo.apijobs.job.JobPosition;

import java.util.List;

public interface JobRepository {

    List<JobPosition> getJobs ();

}
