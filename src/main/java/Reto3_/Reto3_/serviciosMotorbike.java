
package Reto3_.Reto3_;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class serviciosMotorbike {
    
    @Autowired
    private RepositorioMotorbike metodosCrud;
    
    public List<Motorbike> getAll(){
        return metodosCrud.getAll();
        
    }
    
    public Optional<Motorbike> getMotorbike(int idcategory){
        return metodosCrud.getMotorbike(idcategory);
    }
    
    public Motorbike save (Motorbike motorbike)  {
        if (motorbike.getId() ==null){
            return metodosCrud.save(motorbike);
        }else{
            Optional<Motorbike> evt=metodosCrud.getMotorbike(motorbike.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(motorbike);
            }else{
                return motorbike;
            }
        }
    } 
}
