package com.UPBCanteen.repository;

import com.UPBCanteen.model.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealRepository extends JpaRepository<Meal, Long> {
}
