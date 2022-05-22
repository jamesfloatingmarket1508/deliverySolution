package com.example.delivery.controller;

import com.example.delivery.common.domain.Response;
import com.example.delivery.common.exception.BaseController;
import com.example.delivery.dto.DeliveryOrder;
import com.example.delivery.dto.DeliveryRequest;
import com.example.delivery.item.ItemRepository;
import com.example.delivery.jobs.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

@RestController
@RequestMapping("/delivery")
public class DeliveryController extends BaseController {

    private static final Logger LOG = LogManager.getLogger(DeliveryController.class);

    @Autowired
    private JobRepository jobRepo;

    @Autowired
    private ItemRepository itemRepo;

    @GetMapping("/getInfo")
    public ResponseEntity<Response> getJoinInformation(){
        List<DeliveryOrder> deliOrders = jobRepo.getJoinInformation();
        return success(deliOrders);
    }

    @GetMapping("/findAllJobs")
    public ResponseEntity<Response> findAllJobs(){
        return success(jobRepo.findAll());
    }

    @PostMapping("/placeOrder")
    public ResponseEntity<Response> placeOrder (@RequestBody DeliveryRequest deliveryRequest){
        return success(jobRepo.save(deliveryRequest.getJob()));
    }

}
