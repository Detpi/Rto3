/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_.Reto3_;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class RepositorioCategoria {
        @Autowired
    private interfaceCategoria crud;
    
    public List<Category> getAll(){
        return (List<Category>) crud.findAll();
    }
    
    public java.util.Optional <Category> getCategoria(int id){
        return crud.findById(id);
    }
    
    public Category save(Category categoria ){
        return crud.save(categoria);
    }
    
}
