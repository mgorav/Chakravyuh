package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.Chakravyuh;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ChakravyuhRepository extends Neo4jRepository<Chakravyuh, Long> {
}
