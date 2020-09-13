package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.FeatureSet;
import com.gonnect.chakravyuh.model.Parameter;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ParameterRepository extends Neo4jRepository<Parameter, Long> {
}
