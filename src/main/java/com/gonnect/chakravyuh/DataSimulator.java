package com.gonnect.chakravyuh;

import com.gonnect.chakravyuh.model.*;
import com.gonnect.chakravyuh.repository.*;
import org.neo4j.ogm.session.Session;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;

@Service
public class DataSimulator {
    private final ChakravyuhRepository chakravyuhRepository;
    private final DataSetRepository dataSetRepository;
    private final ExecutionRepository executionRepository;
    private final FeatureGroupRepository featureGroupRepository;
    private final FeatureRepository featureRepository;
    private final FeatureSetRepository featureSetRepository;
    private final ParameterRepository parameterRepository;
    private final Session session;

    public DataSimulator(ChakravyuhRepository chakravyuhRepository, DataSetRepository dataSetRepository,
                         ExecutionRepository executionRepository, FeatureGroupRepository featureGroupRepository,
                         FeatureRepository featureRepository, FeatureSetRepository featureSetRepository,
                         ParameterRepository parameterRepository, Session session) {
        this.chakravyuhRepository = chakravyuhRepository;
        this.dataSetRepository = dataSetRepository;
        this.executionRepository = executionRepository;
        this.featureGroupRepository = featureGroupRepository;
        this.featureRepository = featureRepository;
        this.featureSetRepository = featureSetRepository;
        this.parameterRepository = parameterRepository;
        this.session = session;
    }

    @Transactional
    public void simulate() {
        session.query("MATCH (n) OPTIONAL MATCH (n)-[r]-() DELETE n,r", Collections.EMPTY_MAP);
        System.out.println("Entering data ....");
        for (long cnt = 1; cnt < 20; cnt++) {

            Chakravyuh chakravyuh = new Chakravyuh();
            chakravyuh.setName("chakravyuh" + cnt);
            chakravyuh.setOvn(1L);

            FeatureGroup featureGroup = new FeatureGroup();
            featureGroup.setName("featureGroup" + cnt);
            featureGroup.setOvn(1L);

            FeatureSet featureSet = new FeatureSet();
            featureSet.setName("featureSet" + cnt);
            featureGroup.setOvn(1L);

            featureGroup.setFeatureSets(Arrays.asList(featureSet));

            DataSet dataSet = new DataSet();
            dataSet.setName("dataset" + cnt);
            dataSet.setOvn(1L);
            dataSet.setLocation("s3a://mybucket" + cnt);

            Feature feature1 = new Feature();
            feature1.setName("feature1");
            feature1.setValue("value1");
            feature1.setOvn(1L);

            Feature feature2 = new Feature();
            feature2.setName("feature2");
            feature2.setValue("value2");
            feature2.setOvn(1L);

            featureSet.setDataSet(dataSet);
            featureSet.setFeatures(Arrays.asList(feature1, feature2));

            Execution execution = new Execution();
            execution.setName("execution" + cnt);
            execution.setOvn(1L);
            execution.setStartDateTime(LocalDateTime.now());
            execution.setEndDateTime(LocalDateTime.now().plusHours(1));

            Parameter parameter1 = new Parameter();
            parameter1.setName("param1-" + cnt);
            parameter1.setValue("value1-" + cnt);

            Parameter parameter2 = new Parameter();
            parameter2.setName("param2-" + cnt);
            parameter2.setValue("value2-" + cnt);

            execution.setParameters(Arrays.asList(parameter1, parameter2));

            chakravyuh.setExecutions(Arrays.asList(execution));
            chakravyuh.setFeatureGroups(Arrays.asList(featureGroup));


            // persist the graph

            parameterRepository.save(parameter1);
            parameterRepository.save(parameter2);
            executionRepository.save(execution);
            featureRepository.save(feature1);
            featureRepository.save(feature2);
            dataSetRepository.save(dataSet);
            featureSetRepository.save(featureSet);
            featureGroupRepository.save(featureGroup);
            chakravyuhRepository.save(chakravyuh);

        }

        System.out.println("Data entered");


    }
}
