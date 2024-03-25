package com.ocenimmebackend.ocenimebackenddemo.controllers.rest;

import com.ocenimmebackend.ocenimebackenddemo.models.Appraisal;
import com.ocenimmebackend.ocenimebackenddemo.models.InputInfo;
import com.ocenimmebackend.ocenimebackenddemo.services.AppraisalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appraisal")
public class AppraisalController {
    private AppraisalService appraisalService;

    @Autowired
    public AppraisalController(AppraisalService appraisalService) {
        this.appraisalService = appraisalService;
    }

    @PostMapping()
    public ResponseEntity<Appraisal> getAppraisal(@RequestBody InputInfo inputInfo) {

        return  new ResponseEntity<>(appraisalService.getAppraisal(inputInfo), HttpStatus.OK);
    }

}
