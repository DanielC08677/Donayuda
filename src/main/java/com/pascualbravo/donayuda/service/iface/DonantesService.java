package com.pascualbravo.donayuda.service.iface;

import com.pascualbravo.donayuda.models.entity.Donantes;
import java.util.List;

public interface DonantesService {
    
    void create(Donantes donantes);
    
    List<Donantes> getAll();
    
    
    void update(int identificacion,Donantes donantes);

    void delete(int identificacion);
    
}
