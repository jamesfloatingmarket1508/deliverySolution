package com.example.delivery.item;

import com.example.delivery.common.domain.Response;
import com.example.delivery.common.exception.BaseController;
import com.example.delivery.jobs.Jobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
@RequestMapping("/delivery")
public class ItemController  extends BaseController {

    private static final Logger LOG = LogManager.getLogger(ItemController.class);

    @Autowired
    private ItemRepository itemRepo;

    @GetMapping("/getItems")
    public ResponseEntity<Response> getAll() {
        List<Item> item =  itemRepo.findAll();
        return success(item);
    }

}
