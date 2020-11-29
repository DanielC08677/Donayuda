package com.pascualbravo.donayuda.service.iface;

import com.pascualbravo.donayuda.models.entity.Fundaciones;
import java.util.List;

public interface FundacionesService {
    
    void create(Fundaciones fundacion);
    
    List<Fundaciones> getAll();
    
    
    void update(int identificacion,Fundaciones fundacion);

    void delete(int identificacion);
}
