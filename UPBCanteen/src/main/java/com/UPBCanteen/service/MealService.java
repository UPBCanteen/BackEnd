package com.UPBCanteen.service;

import com.UPBCanteen.model.Meal;
import com.UPBCanteen.repository.MealRepository;
import org.springframework.stereotype.Service;

@Service
public class MealService {
    private MealRepository mealRepository;

    public MealService(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    public void save(Meal meal) {
        mealRepository.save(meal);
    }

    public void delete(Meal meal) {
        mealRepository.delete(meal);
    }
}
