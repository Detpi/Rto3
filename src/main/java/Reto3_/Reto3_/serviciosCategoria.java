/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto3_.Reto3_;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviciosCategoria {
    @Autowired
    private RepositorioCategoria metodosCrud;
    
    public List<Category> getAll(){
         return metodosCrud.getAll();
    }
    
    public Optional<Category> getCategoria(int idCategoria){
        return metodosCrud.getCategoria(idCategoria);
    }
    
    
    public Category save(Category categoria){
        if(categoria.getId()==null){
            return metodosCrud.save(categoria);
        }else{
            Optional<Category> evt=metodosCrud.getCategoria(categoria.getId());
            if(evt.isEmpty()){
            return metodosCrud.save(categoria);
            }else{
                return categoria;
            }
        
        
        }
    
    }
}
