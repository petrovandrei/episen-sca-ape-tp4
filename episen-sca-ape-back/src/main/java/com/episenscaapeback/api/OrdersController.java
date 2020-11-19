package com.episenscaapeback.api;

import com.episenscaapeback.utils.OrderWriter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
public class OrdersController {

    @PostMapping("/add/order")
    public void ordersPost(@RequestBody String order) {
        OrderWriter.writeInFile(order);
        System.out.println("got it");
    }
}
