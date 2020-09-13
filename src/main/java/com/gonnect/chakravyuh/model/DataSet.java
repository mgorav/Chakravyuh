package com.gonnect.chakravyuh.model;

import lombok.Data;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@NodeEntity
@Data
public class DataSet {
    @Id
    @GeneratedValue
    private Long id;
    @Index
    private String name;
    @Index
    private String location;
    private Long ovn;
}
