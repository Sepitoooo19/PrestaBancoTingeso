package com.example.PrestaBanco.repositories;


import com.example.PrestaBanco.entities.ClientEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Repository
public interface ClientRepository extends JpaRepository<ClientEntity, Long> {
    public ClientEntity findByRut(String rut);
    List<ClientEntity> findAll();
    @Query("SELECT c FROM ClientEntity c WHERE c.rut = :rut")
    public ClientEntity findByRutQuery(@Param("rut") String rut);
    @Query("SELECT c FROM ClientEntity c WHERE c.name = :name")
    public List<ClientEntity> findByNameQuery(@Param("name") String name);



}
