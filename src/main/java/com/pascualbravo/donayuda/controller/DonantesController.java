package com.pascualbravo.donayuda.controller;

import com.pascualbravo.donayuda.models.entity.Donantes;
import com.pascualbravo.donayuda.service.iface.DonantesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Donantes")
@CrossOrigin("*")
public class DonantesController {
    
    @Autowired
    private DonantesService donantesService;
    
    @PostMapping
    public void create(@RequestBody Donantes donantes){
        donantesService.create(donantes);
    } 
    
    @GetMapping
    public List<Donantes> getAll(){
        return donantesService.getAll();
    }
    
    @PutMapping("/{identificacion}")
    public void update(@PathVariable int identificacion,@RequestBody Donantes donantes){
        donantesService.update(identificacion, donantes);
    }
    
    @DeleteMapping("/{identificacion}")
    public void delete(@PathVariable int identificacion){
       donantesService.delete(identificacion);
    }
}
