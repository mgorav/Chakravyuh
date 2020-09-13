package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.ModelRegistry;
import com.gonnect.chakravyuh.model.Rank;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ModelRegistryRepository extends Neo4jRepository<ModelRegistry, Long> {
}
