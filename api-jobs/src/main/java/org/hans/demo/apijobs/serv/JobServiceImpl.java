package org.hans.demo.apijobs.serv;

import org.hans.demo.apijobs.job.JobPosition;
import org.hans.demo.apijobs.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobServiceImpl implements JobService{

    @Autowired
    private JobRepository repo;

    @Override
    public List<JobPosition> getJobs(String description, String location, int page, boolean fullTime) {
        return repo.getJobs()
                .stream()
                .filter(jobPosition -> {
                    boolean jobDescription = jobPosition.getDescription().contains(description) || jobPosition.getTitle().contains(description);
                    return jobDescription && jobPosition.getLocation().contains(location);
                })
                .limit(10)
                .collect(Collectors.toList());
    }


}
