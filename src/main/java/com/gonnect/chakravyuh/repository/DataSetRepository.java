package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.Chakravyuh;
import com.gonnect.chakravyuh.model.DataSet;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface DataSetRepository extends Neo4jRepository<DataSet, Long> {
}
