package org.hans.demo.api;

import feign.Headers;
import feign.QueryMap;
import feign.RequestLine;
import org.hans.demo.JobPosition;

import java.util.List;
import java.util.Map;

@Headers("accept:application/json")
public interface APIJobs {

    @RequestLine("GET /api/jobs")
    List<JobPosition> jobs(@QueryMap Map<String, Object> queryMap);

}
