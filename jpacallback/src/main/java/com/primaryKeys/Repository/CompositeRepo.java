package com.primaryKeys.Repository;

import com.primaryKeys.model.Composite;
import com.primaryKeys.util.NamedId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompositeRepo extends JpaRepository<Composite, NamedId> {
}
