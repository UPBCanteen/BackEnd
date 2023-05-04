package com.UPBCanteen.controller;

import com.UPBCanteen.model.Meal;
import com.UPBCanteen.service.MealService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/meal")
public class MealController {

    @Autowired
    private MealService mealService;

    @PostMapping(path = "/add")
    public ResponseEntity<Meal> save(@RequestBody Meal meal){
        mealService.save(meal);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
