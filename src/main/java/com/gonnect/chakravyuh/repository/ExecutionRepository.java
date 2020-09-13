package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.DataSet;
import com.gonnect.chakravyuh.model.Execution;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ExecutionRepository extends Neo4jRepository<Execution, Long> {
}
