package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.FeatureGroup;
import com.gonnect.chakravyuh.model.FeatureSet;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface FeatureSetRepository extends Neo4jRepository<FeatureSet, Long> {
}
