package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.Model;
import com.gonnect.chakravyuh.model.Rank;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface RankRepository extends Neo4jRepository<Rank, Long> {
}
