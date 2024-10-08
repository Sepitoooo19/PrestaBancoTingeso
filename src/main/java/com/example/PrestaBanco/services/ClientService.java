package com.example.PrestaBanco.services;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.PrestaBanco.repositories.ClientRepository;
import com.example.PrestaBanco.entities.ClientEntity;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;




@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<ClientEntity> getAllClients(){
        return clientRepository.findAll();
    }

    public ClientEntity getClientByRut(String rut){
        return clientRepository.findByRut(rut);
    }

    public ClientEntity getClientByRutQuery(String rut){
        return clientRepository.findByRutQuery(rut);
    }

    public List<ClientEntity> getClientByNameQuery(String name){
        return clientRepository.findByNameQuery(name);
    }

    public ClientEntity saveClient(ClientEntity client){
        return clientRepository.save(client);
    }

    public void deleteClient(Long id){
        clientRepository.deleteById(id);
    }

    public ClientEntity updateClient(Long id, ClientEntity client){
        ClientEntity clientToUpdate = clientRepository.findById(id).get();
        clientToUpdate.setRut(client.getRut());
        clientToUpdate.setName(client.getName());
        clientToUpdate.setEmail(client.getEmail());
        clientToUpdate.setPhone(client.getPhone());
        clientToUpdate.setMonthlySalary(client.getMonthlySalary());
        clientToUpdate.setPersonalSavings(client.getPersonalSavings());
        clientToUpdate.setJobSeniority(client.getJobSeniority());
        clientToUpdate.setJobType(client.getJobType());
        return clientRepository.save(clientToUpdate);
    }


}
