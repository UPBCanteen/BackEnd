package com.UPBCanteen.dto;

import com.UPBCanteen.model.Meal;
import com.UPBCanteen.model.Role;

import java.util.List;

public class UserDTO {
    private Long id;

    private String username;

    private String email;

    private String password;

    private List<Meal> meals;

    private List<Role> roles;
}
