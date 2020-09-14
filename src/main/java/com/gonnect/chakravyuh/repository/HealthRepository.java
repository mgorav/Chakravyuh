package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.Chakravyuh;
import com.gonnect.chakravyuh.model.Health;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface HealthRepository extends Neo4jRepository<Health, Long> {
}
