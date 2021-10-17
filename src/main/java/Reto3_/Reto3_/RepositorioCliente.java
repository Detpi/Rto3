/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_.Reto3_;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioCliente {
    @Autowired
    private interfaceCliente crud;
    
    public List<Cliente> getAll (){
        return (List<Cliente>) crud.findAll();
    }
    
    public Optional <Cliente> getCliente(int id){
        return crud.findById(id);
        
   }
    public Cliente save(Cliente cliente){
        return crud.save(cliente);
        
   }
   
}
