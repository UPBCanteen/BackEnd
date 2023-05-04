package com.UPBCanteen.dto;

import com.UPBCanteen.model.Canteen;
import com.UPBCanteen.model.MealQuantity;
import com.UPBCanteen.model.User;
import jakarta.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrderDTO {
    private Long id;

    private Canteen canteen;

    private User user;

    private List<MealQuantity> mealQuantities;

    private Date time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Canteen getCanteen() {
        return canteen;
    }

    public void setCanteen(Canteen canteen) {
        this.canteen = canteen;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<MealQuantity> getMealQuantities() {
        return mealQuantities;
    }

    public void setMealQuantities(List<MealQuantity> mealQuantities) {
        this.mealQuantities = mealQuantities;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
