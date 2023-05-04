package com.UPBCanteen.controller;

import com.UPBCanteen.model.Canteen;
import com.UPBCanteen.service.CanteenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/canteen")
public class CanteenController {

    @Autowired
    private CanteenService canteenService;

    @PostMapping(path = "/add")
    public ResponseEntity<Canteen> save(@RequestBody Canteen canteen){
        canteenService.save(canteen);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
