package com.pascualbravo.donayuda.models.repositorio;

import com.pascualbravo.donayuda.models.entity.Donantes;
import org.springframework.data.repository.CrudRepository;

public interface DonantesRepository extends CrudRepository <Donantes,Integer> {
    
}
