/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.ejemplojpa.crud.services;

import co.edu.usa.ejemplojpa.crud.models.Rol;
import co.edu.usa.ejemplojpa.crud.repository.RolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jaque
 */
@Service
public class RolService {
    
    @Autowired
    private RolRepository rp;
    
    public List<Rol> getAll(){
        return (List<Rol>)rp.findAll();
    }
}
