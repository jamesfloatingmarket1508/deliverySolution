package com.example.delivery.jobs;

import com.example.delivery.common.domain.Response;
import com.example.delivery.common.exception.BaseController;
import com.example.delivery.item.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

@RestController
@RequestMapping("/job")
public class JobController  extends BaseController {

    private static final Logger LOG = LogManager.getLogger(JobController.class);

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    ItemRepository itemRepository;

    @GetMapping("/getjobs")
    public ResponseEntity<Response> all() {
       List<Jobs> jobs =  jobRepository.findAll();
       return success(jobs);
    }

    @GetMapping("/getJobByName")
    public ResponseEntity<Response> getJobBName(@RequestBody String jobName) {
        List<Jobs> jobs =  jobRepository.findByJobname(jobName);
        return success(jobs);
    }


}
