package com.sid.amsapi.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.sid.amsapi.entities.Provider;

@Repository
public interface ProviderRepository extends CrudRepository<Provider, Long> {
}
