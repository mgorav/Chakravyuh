package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

@NodeEntity
@Data
public class Parameter {
    @Id
    @GeneratedValue
    @EndNode
    private Long id;
    @Index
    private String name;
    @Index
    private String value;
    private Long ovn;
}
