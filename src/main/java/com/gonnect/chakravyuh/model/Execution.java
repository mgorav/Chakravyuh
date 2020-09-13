package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@NodeEntity
@Data
public class Execution {
    @Id
    @GeneratedValue
    private Long id;
    @Index
    private String name;
    @Relationship(type = "EXECUTION_WITH_PARAMETERS")
    private List<Parameter> parameters;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private Long ovn;
}
