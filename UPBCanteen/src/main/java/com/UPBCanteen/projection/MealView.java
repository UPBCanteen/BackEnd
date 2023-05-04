package com.UPBCanteen.projection;

import com.UPBCanteen.model.Canteen;
import com.UPBCanteen.model.MealQuantity;

import java.util.List;

public interface MealView {
    Long getId();
    Canteen getCanteen();
    String getName();
    Long getQuantity();
    Long getRemain_quantity();
    List<MealQuantityView> getMealQuantities();
}
