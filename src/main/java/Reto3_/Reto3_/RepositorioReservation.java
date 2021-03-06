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
class RepositorioReservation {
    @Autowired
    private interfaceReservation crud;
    
    public List<Reservation> getAll (){
        return (List<Reservation>) crud.findAll();
    }
    public Optional <Reservation> getReservation (int id){
        return crud.findById(id);
        
   }
     public Reservation save(Reservation reservation){
        return crud.save(reservation);
        
    }
}
