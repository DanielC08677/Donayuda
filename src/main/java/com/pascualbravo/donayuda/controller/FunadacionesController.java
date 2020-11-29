 package com.pascualbravo.donayuda.controller;

import com.pascualbravo.donayuda.models.entity.Fundaciones;
import com.pascualbravo.donayuda.service.iface.FundacionesService;
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
@RequestMapping("/Fundaciones")
@CrossOrigin("*")
public class FunadacionesController {
   
    @Autowired
    private FundacionesService fundacionesService;
    
    @PostMapping("/create")
    public void create (@RequestBody Fundaciones fundacion){
        fundacionesService.create(fundacion);
    }
    
    @GetMapping
    public List<Fundaciones> getAll()
            {
                return fundacionesService.getAll();
            }
    
    @PutMapping("/update/{identificacion}")  
    public void update (@PathVariable int identificacion,@RequestBody Fundaciones fundacion)
    {
        fundacionesService.update(identificacion, fundacion);
    }
    
    @DeleteMapping("/{identificacion}")
    public void delete(@PathVariable int identificacion)
    {
     fundacionesService.delete(identificacion);
    }
    
}
