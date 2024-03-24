package com.ocenimmebackend.ocenimebackenddemo.controllers.rest;

import com.ocenimmebackend.ocenimebackenddemo.models.InputInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appraisal")
public class AppraisalController {

    @PostMapping()
    public ResponseEntity<String> getAppraisal(@RequestBody InputInfo inputInfo) {
        String res = "{\n" +
                "  \"indexes\": {\n" +
                "    \"schools_index\": [\n" +
                "      3.1071\n" +
                "    ],\n" +
                "    \"mvr_index_combined\": [\n" +
                "      5.25\n" +
                "    ],\n" +
                "    \"parkings_index\": [\n" +
                "      8.95\n" +
                "    ],\n" +
                "    \"parks_index\": [\n" +
                "      4.55\n" +
                "    ],\n" +
                "    \"air_index_year\": [\n" +
                "      4\n" +
                "    ],\n" +
                "    \"transport_index\": [\n" +
                "      9.5\n" +
                "    ],\n" +
                "    \"communication_index\": [\n" +
                "      9.5\n" +
                "    ],\n" +
                "    \"combined_index\": [\n" +
                "      5.8928\n" +
                "    ],\n" +
                "    \"price\": [\n" +
                "      162187.9016\n" +
                "    ],\n" +
                "    \"price_range\": {},\n" +
                "    \"price_m2\": [\n" +
                "      2162.5054\n" +
                "    ],\n" +
                "    \"price_m2_range\": {},\n" +
                "    \"rent\": [\n" +
                "      984\n" +
                "    ]}}";
        return  new ResponseEntity<>(res, HttpStatus.OK);
    }

}
