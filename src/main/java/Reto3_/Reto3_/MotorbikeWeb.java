
package Reto3_.Reto3_;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/Motorbike")

public class MotorbikeWeb {
    @GetMapping("/holaMundo")
    public String saludar(){
        return "Hola Mundo";
    }
            
    @Autowired
    private serviciosMotorbike servicios;
    @GetMapping("/all")
    public List <Motorbike> getMotorbike(){
        return servicios.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Motorbike> getMotorbike(@PathVariable("id") int idcategory){
        return servicios.getMotorbike(idcategory);
    }
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Motorbike save(@RequestBody Motorbike motorbike){
        return servicios.save(motorbike);
    }
    
}
