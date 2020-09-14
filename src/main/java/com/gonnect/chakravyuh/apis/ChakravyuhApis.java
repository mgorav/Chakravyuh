package com.gonnect.chakravyuh.apis;

import com.gonnect.chakravyuh.model.*;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/chakravyuh")
public class ChakravyuhApis {

    @GetMapping("/version")
    public String version() {

        return "0.0.1";
    }


    @PostMapping(value = "/enroll")
    public String enroll(Chakravyuh chakravyuh) {

        return "Enrolled";
    }

    @PostMapping(value = "/deployer")
    public String deployer(Chakravyuh chakravyuh) {

        return "Model deployed to target platform";
    }

    @PostMapping(value = "{id}/users/{userId}/models/")
    public String addModel(@RequestParam Long id, @RequestParam Long userId, Model model) {

        return "Model added";
    }

    @PostMapping(value = "{id}/users/{userId}/models/{modelId}/features")
    public String addFeatures(@RequestParam Long id, @RequestParam Long userId, @RequestParam Long modelId, List<FeatureGroup> featureGroups) {

        return "Features added";
    }

    @PostMapping(value = "{id}/users/{userId}/models/{modelId}/executions")
    public String trainModel(@RequestParam Long id, @RequestParam Long userId, @RequestParam Long modelId, List<Parameter> parameters) {

        return "Model training triggered";
    }

    @GetMapping("/{id}/users/{userId}/models/{modelId}/features")
    public List<FeatureGroup> features(@RequestParam Long id, @RequestParam Long userId, @RequestParam Long modelId) {

        return Collections.emptyList();
    }

    @GetMapping("/{id}/users/{userId}/models/{modelId}/executions")
    public Execution trainingOutcome(@RequestParam Long id, @RequestParam Long userId, @RequestParam Long modelId) {

        return new Execution();
    }

}
