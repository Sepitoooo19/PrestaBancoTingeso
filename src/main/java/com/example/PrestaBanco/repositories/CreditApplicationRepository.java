package com.example.PrestaBanco.repositories;
import com.example.PrestaBanco.entities.CreditApplicationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface CreditApplicationRepository extends JpaRepository<CreditApplicationEntity, Long> {

    public CreditApplicationEntity findByClientId(Long clientId);
    List<CreditApplicationEntity> findAll();
    @Query("SELECT c FROM CreditApplicationEntity c WHERE c.client_id = :clientId")
    public CreditApplicationEntity findByClientIdQuery(@Param("clientId") Long clientId);
    @Query("SELECT c FROM CreditApplicationEntity c WHERE c.amount = :amount")
    public List<CreditApplicationEntity> findByAmountQuery(@Param("amount") double amount);
    @Query("SELECT c FROM CreditApplicationEntity c WHERE c.timeLimit = :timeLimit")
    public List<CreditApplicationEntity> findByTimeLimitQuery(@Param("timeLimit") Integer timeLimit);
    @Query("SELECT c FROM CreditApplicationEntity c WHERE c.application_status = :application_status")
    public List<CreditApplicationEntity> findByApplicationStatusQuery(@Param("application_status") String application_status);
    @Query("SELECT c FROM CreditApplicationEntity c WHERE c.client_id = :clientId AND c.amount = :amount AND c.timeLimit = :timeLimit AND c.application_status = :application_status")
    public CreditApplicationEntity findByAllQuery(@Param("clientId") Long clientId, @Param("amount") double amount, @Param("timeLimit") Integer timeLimit, @Param("application_status") String application_status);
    @Query("SELECT c FROM CreditApplicationEntity c WHERE c.client_id = :clientId AND c.amount = :amount AND c.timeLimit = :timeLimit")
    public CreditApplicationEntity findByClientIdAmountTimeLimitQuery(@Param("clientId") Long clientId, @Param("amount") double amount, @Param("timeLimit") Integer timeLimit);
    @Query("SELECT c FROM CreditApplicationEntity c WHERE c.client_id = :clientId AND c.amount = :amount AND c.application_status = :application_status")
    public CreditApplicationEntity findByClientIdAmountApplicationStatusQuery(@Param("clientId") Long clientId, @Param("amount") double amount, @Param("application_status") String application_status);
    @Query("SELECT c FROM CreditApplicationEntity c WHERE c.client_id = :clientId AND c.timeLimit = :timeLimit AND c.application_status = :application_status")
    public CreditApplicationEntity findByClientIdTimeLimitApplicationStatusQuery(@Param("clientId") Long clientId, @Param("timeLimit") Integer timeLimit, @Param("application_status") String application_status);


}
