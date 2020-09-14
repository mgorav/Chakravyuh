package com.gonnect.chakravyuh.repository;

import com.gonnect.chakravyuh.model.User;
import com.gonnect.chakravyuh.model.UserGroup;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface UserGroupRepository extends Neo4jRepository<UserGroup, Long> {
}
