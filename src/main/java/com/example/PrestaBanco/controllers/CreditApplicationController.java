package com.example.PrestaBanco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.PrestaBanco.entities.CreditApplicationEntity;
import com.example.PrestaBanco.services.CreditApplicationService;
import java.util.List;


@RestController
@RequestMapping("/api/v1/credit-applications")
@CrossOrigin("*")
public class CreditApplicationController {

    @Autowired
    private CreditApplicationService creditApplicationService;

    @GetMapping
    public ResponseEntity<List<CreditApplicationEntity>> getAllCreditApplications(){
        return ResponseEntity.ok(creditApplicationService.getAllCreditApplications());
    }

    @GetMapping("/client/{clientId}")
    public ResponseEntity<CreditApplicationEntity> getCreditApplicationByClientId(@PathVariable Long clientId){
        return ResponseEntity.ok(creditApplicationService.getCreditApplicationByClientId(clientId));
    }

    @GetMapping("/client/query/{clientId}")
    public ResponseEntity<CreditApplicationEntity> getCreditApplicationByClientIdQuery(@PathVariable Long clientId){
        return ResponseEntity.ok(creditApplicationService.getCreditApplicationByClientIdQuery(clientId));
    }

    @GetMapping("/amount/query/{amount}")
    public ResponseEntity<List<CreditApplicationEntity>> getCreditApplicationByAmountQuery(@PathVariable double amount){
        return ResponseEntity.ok(creditApplicationService.getCreditApplicationByAmountQuery(amount));
    }

    @GetMapping("/time-limit/query/{timeLimit}")
    public ResponseEntity<List<CreditApplicationEntity>> getCreditApplicationByTimeLimitQuery(@PathVariable Integer timeLimit){
        return ResponseEntity.ok(creditApplicationService.getCreditApplicationByTimeLimitQuery(timeLimit));
    }

    @GetMapping("/application-status/query/{application_status}")
    public ResponseEntity<List<CreditApplicationEntity>> getCreditApplicationByApplicationStatusQuery(@PathVariable String application_status){
        return ResponseEntity.ok(creditApplicationService.getCreditApplicationByApplicationStatusQuery(application_status));
    }

    @GetMapping("/all/query/{clientId}/{amount}/{timeLimit}/{application_status}")
    public ResponseEntity<CreditApplicationEntity> getCreditApplicationByAllQuery(@PathVariable Long clientId, @PathVariable double amount, @PathVariable Integer timeLimit, @PathVariable String application_status){
        return ResponseEntity.ok(creditApplicationService.getCreditApplicationByAllQuery(clientId, amount, timeLimit, application_status));
    }

    @GetMapping("/client/amount/time-limit/query/{clientId}/{amount}/{timeLimit}")
    public ResponseEntity<CreditApplicationEntity> getCreditApplicationByClientIdAmountTimeLimitQuery(@PathVariable Long clientId, @PathVariable double amount, @PathVariable Integer timeLimit){
        return ResponseEntity.ok(creditApplicationService.getCreditApplicationByClientIdAmountTimeLimitQuery(clientId, amount, timeLimit));
    }

    @GetMapping("/client/amount/application-status/query/{clientId}/{amount}/{application_status}")
    public ResponseEntity<CreditApplicationEntity> getCreditApplicationByClientIdAmountApplicationStatusQuery(@PathVariable Long clientId, @PathVariable double amount, @PathVariable String application_status){
        return ResponseEntity.ok(creditApplicationService.getCreditApplicationByClientIdAmountApplicationStatusQuery(clientId, amount, application_status));
    }

}
