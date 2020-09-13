package com.gonnect.chakravyuh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableNeo4jRepositories
@EnableTransactionManagement
public class ChakravyuhApplication implements ApplicationRunner {
    @Autowired
    private DataSimulator simulator;

    public static void main(String[] args) {
        SpringApplication.run(ChakravyuhApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        simulator.simulate();
    }
}
