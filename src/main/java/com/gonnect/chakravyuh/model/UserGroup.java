package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
@Data
public class UserGroup {
    @Id
    @GeneratedValue
    @EndNode
    private Long id;
    @Index
    private String name;
    @Relationship(type = "USERS_IN_GROUP")
    private List<User> users;
    private Long ovn;
}
