package com.UPBCanteen.projection;

import java.util.List;

public interface CanteenView {
    Long getId();
    String getName();
    String getLocation();
    String getSchedule();
    List<MealView> getMeals();
    List<OrderView> getOrders();
}
