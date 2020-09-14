package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserRepository extends Neo4jRepository<User, Long> {
}
