package com.UPBCanteen.controller;

import com.UPBCanteen.service.UserTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/user_type")
public class UserTypeController {
    @Autowired
    private UserTypeService userTypeService;

    @PostMapping(path = "/add")
    public ResponseEntity<UserType> save(@RequestBody UserType userType){
        userTypeService.save(userType);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
