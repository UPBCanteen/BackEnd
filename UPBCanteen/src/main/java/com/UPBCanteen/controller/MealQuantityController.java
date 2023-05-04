package com.UPBCanteen.controller;

import com.UPBCanteen.model.MealQuantity;
import com.UPBCanteen.service.MealQuantityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/meal_quantity")
public class MealQuantityController {
    @Autowired
    private MealQuantityService mealQuantityService;

    @PostMapping(path = "/add")
    public ResponseEntity<MealQuantity> save(@RequestBody MealQuantity mealQuantity){
        mealQuantityService.save(mealQuantity);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
