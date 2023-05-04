package com.UPBCanteen.repository;

import com.UPBCanteen.model.MealQuantity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealQuantityRepository extends JpaRepository<MealQuantity, Long> {
}
