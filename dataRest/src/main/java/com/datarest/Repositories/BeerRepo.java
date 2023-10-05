package com.datarest.Repositories;

import com.datarest.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(path = "beer",collectionResourceRel = "beer")
public interface BeerRepo extends JpaRepository<Beer,Integer> {
}
