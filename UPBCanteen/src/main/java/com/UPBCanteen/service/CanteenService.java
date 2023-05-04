package com.UPBCanteen.service;

import com.UPBCanteen.model.Canteen;
import com.UPBCanteen.repository.CanteenRepository;
import org.springframework.stereotype.Service;

@Service
public class CanteenService {
    private CanteenRepository canteenRepository;

    public CanteenService(CanteenRepository canteenRepository) {
        this.canteenRepository = canteenRepository;
    }

    public void save(Canteen canteen) {
        canteenRepository.save(canteen);
    }

    public void delete(Canteen canteen) {
        canteenRepository.delete(canteen);
    }
}
