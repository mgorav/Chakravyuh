package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.Execution;
import com.gonnect.chakravyuh.model.Feature;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface FeatureRepository extends Neo4jRepository<Feature, Long> {
}
