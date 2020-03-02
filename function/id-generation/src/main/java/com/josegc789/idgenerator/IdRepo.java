package com.josegc789.idgenerator;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdRepo extends CrudRepository<TestEnmtin, Long> {
}
