package com.UPBCanteen.dto;

import com.UPBCanteen.model.Canteen;
import com.UPBCanteen.model.MealQuantity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MealDTO {

    private Long id;

    private Canteen canteen;

    private String name;

    private Long quantity;

    private Long remain_quantity;

    private List<MealQuantity> mealQuantities;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getRemain_quantity() {
        return remain_quantity;
    }

    public void setRemain_quantity(Long remain_quantity) {
        this.remain_quantity = remain_quantity;
    }

    public List<MealQuantity> getMealQuantities() {
        return mealQuantities;
    }

    public void setMealQuantities(List<MealQuantity> mealQuantities) {
        this.mealQuantities = mealQuantities;
    }
}
