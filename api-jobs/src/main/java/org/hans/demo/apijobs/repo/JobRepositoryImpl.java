package org.hans.demo.apijobs.repo;

import net.datafaker.Faker;
import net.datafaker.providers.base.Job;
import org.hans.demo.apijobs.job.JobPosition;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Repository
public class JobRepositoryImpl implements JobRepository{

    private final Faker faker = new Faker();

    @Cacheable("jobs")
    @Override
    public List<JobPosition> getJobs() {
        List<JobPosition> positions = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            positions.add(generateJob());
        }

        return positions;
    }

    private JobPosition generateJob () {

        Job jobFake = faker.job();

        JobPosition job = new JobPosition.JobPositionBuilder()
                .addDescription(jobFake.position())
                .addTitle(jobFake.title())
                .addCompany(faker.company().name())
                .addCompanyLogo(faker.company().logo())
                .addCompanyUrl(faker.company().url())
                .addType(jobFake.seniority())
                .addLocation(faker.country().name())
                .addUrl(faker.company().url())
                .addCreatedAt(faker.date().past(1, TimeUnit.HOURS, "YYYY-MM-dd mm:hh:ss").toString())
                .build();

        return job;
    }
}
