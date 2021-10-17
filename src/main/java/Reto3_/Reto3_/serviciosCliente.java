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
public class serviciosCliente {

    @Autowired
    private RepositorioCliente metodosCrud;

    public List<Cliente> getAll() {
        return metodosCrud.getAll();

    }

    public Optional<Cliente> getCliente(int idCategoria) {
        return metodosCrud.getCliente(idCategoria);
    }

    public Cliente save(Cliente cliente) {
        if (cliente.getIdClient() == null) {
            return metodosCrud.save(cliente);
        } else {
            Optional<Cliente> evt = metodosCrud.getCliente(cliente.getIdClient());
            if (evt.isEmpty()) {
                return metodosCrud.save(cliente);
            } else {
                return cliente;
            }
        }
    }
}