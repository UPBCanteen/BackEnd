package com.UPBCanteen.projection;

import com.UPBCanteen.model.Meal;
import com.UPBCanteen.model.Order;

public interface MealQuantityView {
    Long getId();
    Order getOrder();
    Meal getMeal();
    Long getQuantity();
}
