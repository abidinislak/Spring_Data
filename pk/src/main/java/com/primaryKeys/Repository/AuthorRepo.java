package com.primaryKeys.Repository;

import com.primaryKeys.model.AuthorComposite;
import com.primaryKeys.util.NamedId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<AuthorComposite, NamedId> {
}
