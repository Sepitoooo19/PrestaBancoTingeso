package com.example.PrestaBanco.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.PrestaBanco.entities.ClientEntity;
import com.example.PrestaBanco.services.ClientService;
import java.util.List;


@RestController
@RequestMapping("/api/v1/clients")
@CrossOrigin("*")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<List<ClientEntity>> getAllClients(){
        return ResponseEntity.ok(clientService.getAllClients());
    }

    @GetMapping("/{rut}")
    public ResponseEntity<ClientEntity> getClientByRut(@PathVariable String rut){
        return ResponseEntity.ok(clientService.getClientByRut(rut));
    }

    @GetMapping("/query/{rut}")
    public ResponseEntity<ClientEntity> getClientByRutQuery(@PathVariable String rut){
        return ResponseEntity.ok(clientService.getClientByRutQuery(rut));
    }

    @GetMapping("/query/name/{name}")
    public ResponseEntity<List<ClientEntity>> getClientByNameQuery(@PathVariable String name){
        return ResponseEntity.ok(clientService.getClientByNameQuery(name));
    }

    @PostMapping
    public ResponseEntity<ClientEntity> saveClient(@RequestBody ClientEntity client){
        return ResponseEntity.ok(clientService.saveClient(client));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id){
        clientService.deleteClient(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<ClientEntity> updateClient(@PathVariable Long id, @RequestBody ClientEntity client){
        return ResponseEntity.ok(clientService.updateClient(id, client));
    }
}
