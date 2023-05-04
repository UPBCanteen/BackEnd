package com.UPBCanteen.projection;

import com.UPBCanteen.model.Meal;
import com.UPBCanteen.model.Role;

import java.util.List;
import java.util.Set;

public interface UserView {
    Long getId();
    List<Role> getRoles();
    String getUsername();
    String getEmail();
    List<Meal> getMeals();
}
