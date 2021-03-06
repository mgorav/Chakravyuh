package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.Model;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface ModelRepository extends Neo4jRepository<Model, Long> {
}
