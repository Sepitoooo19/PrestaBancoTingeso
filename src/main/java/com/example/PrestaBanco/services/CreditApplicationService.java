package com.example.PrestaBanco.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.PrestaBanco.repositories.CreditApplicationRepository;
import com.example.PrestaBanco.entities.CreditApplicationEntity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


@Service
public class CreditApplicationService {


    @Autowired
    private CreditApplicationRepository creditApplicationRepository;

    public List<CreditApplicationEntity> getAllCreditApplications(){
        return creditApplicationRepository.findAll();
    }

    public CreditApplicationEntity getCreditApplicationByClientId(Long clientId){
        return creditApplicationRepository.findByClientId(clientId);
    }

    public CreditApplicationEntity getCreditApplicationByClientIdQuery(Long clientId){
        return creditApplicationRepository.findByClientIdQuery(clientId);
    }

    public List<CreditApplicationEntity> getCreditApplicationByAmountQuery(double amount){
        return creditApplicationRepository.findByAmountQuery(amount);
    }

    public List<CreditApplicationEntity> getCreditApplicationByTimeLimitQuery(Integer timeLimit){
        return creditApplicationRepository.findByTimeLimitQuery(timeLimit);
    }

    public List<CreditApplicationEntity> getCreditApplicationByApplicationStatusQuery(String application_status){
        return creditApplicationRepository.findByApplicationStatusQuery(application_status);
    }

    public CreditApplicationEntity getCreditApplicationByAllQuery(Long clientId, double amount, Integer timeLimit, String application_status){
        return creditApplicationRepository.findByAllQuery(clientId, amount, timeLimit, application_status);
    }

    public CreditApplicationEntity getCreditApplicationByClientIdAmountTimeLimitQuery(Long clientId, double amount, Integer timeLimit){
        return creditApplicationRepository.findByClientIdAmountTimeLimitQuery(clientId, amount, timeLimit);
    }

    public CreditApplicationEntity getCreditApplicationByClientIdAmountApplicationStatusQuery(Long clientId, double amount, String application_status){
        return creditApplicationRepository.findByClientIdAmountApplicationStatusQuery(clientId, amount, application_status);
    }

    public CreditApplicationEntity getCreditApplicationByClientIdTimeLimitApplicationStatusQuery(Long clientId, Integer timeLimit, String application_status){
        return creditApplicationRepository.findByClientIdTimeLimitApplicationStatusQuery(clientId, timeLimit, application_status);
    }

    public CreditApplicationEntity saveCreditApplication(CreditApplicationEntity creditApplication){
        return creditApplicationRepository.save(creditApplication);
    }

    public void deleteCreditApplication(Long id){
        creditApplicationRepository.deleteById(id);
    }



}
