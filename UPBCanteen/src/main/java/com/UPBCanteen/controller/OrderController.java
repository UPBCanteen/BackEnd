package com.UPBCanteen.controller;

import com.UPBCanteen.model.Order;
import com.UPBCanteen.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping(path = "/add")
    public ResponseEntity<Order> save(@RequestBody Order order){
        orderService.save(order);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
