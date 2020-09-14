package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.apache.catalina.LifecycleState;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
@Data
public class UserGroup {
    @Id
    @GeneratedValue
    private Long id;
    @Index
    private String name;
    @Relationship(type = "ENROLLED_USES")
    private List<User> users;
    private Long ovn;
}
