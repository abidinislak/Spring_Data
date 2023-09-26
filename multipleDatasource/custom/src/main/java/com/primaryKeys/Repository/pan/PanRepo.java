package com.primaryKeys.Repository.pan;

import com.primaryKeys.model.pan.Pan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanRepo extends JpaRepository<Pan, Integer> {
}
