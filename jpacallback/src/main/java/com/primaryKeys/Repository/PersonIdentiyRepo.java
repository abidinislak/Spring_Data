package com.primaryKeys.Repository;

import com.primaryKeys.model.PersonIdentity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonIdentiyRepo extends JpaRepository<PersonIdentity,Integer> {
}
