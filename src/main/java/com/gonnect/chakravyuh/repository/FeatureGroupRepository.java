package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.Feature;
import com.gonnect.chakravyuh.model.FeatureGroup;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface FeatureGroupRepository extends Neo4jRepository<FeatureGroup, Long> {
}
