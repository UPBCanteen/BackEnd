package com.UPBCanteen.repository;

import com.UPBCanteen.model.Canteen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CanteenRepository extends JpaRepository<Canteen, Long> {
}
