package com.UPBCanteen.projection;

import com.UPBCanteen.model.Canteen;
import com.UPBCanteen.model.User;

import java.util.Date;
import java.util.List;

public interface OrderView {
    Long getId();
    Canteen getCanteen();
    User getUser();
    List<MealQuantityView> getMealQuantities();
    Date getTime();
}
