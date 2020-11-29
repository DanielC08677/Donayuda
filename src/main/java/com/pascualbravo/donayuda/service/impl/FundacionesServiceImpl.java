package com.pascualbravo.donayuda.service.impl;

import com.pascualbravo.donayuda.models.entity.Fundaciones;
import com.pascualbravo.donayuda.models.repositorio.FundacionesRepository;
import com.pascualbravo.donayuda.service.iface.FundacionesService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FundacionesServiceImpl implements FundacionesService {

    @Autowired 
    private FundacionesRepository fundacionesReposiitory;
    
    @Override
    public void create(Fundaciones fundacion) {
        fundacionesReposiitory.save(fundacion);
    }

    @Override
    public List<Fundaciones> getAll() {
        List<Fundaciones> fundacion = new ArrayList<>();
        fundacionesReposiitory.findAll().forEach(fundacion::add);
        return fundacion;
    }

    @Override
    public void update(int identificacion, Fundaciones fundacion) {
        Optional<Fundaciones> existFunda = fundacionesReposiitory.findById(identificacion);
        if(existFunda.isPresent())
        {
            existFunda.get().setNombreFundacion(fundacion.getNombreFundacion());
            existFunda.get().setProposito(fundacion.getProposito());
            existFunda.get().setDireccion(fundacion.getDireccion());
            existFunda.get().setTelefo(fundacion.getTelefo());
            
            fundacionesReposiitory.save(existFunda.get());
        }
    }

    @Override
    public void delete(int identificacion) {   
        Optional<Fundaciones> existFun =fundacionesReposiitory.findById(identificacion);
        if(existFun.isPresent()){
            fundacionesReposiitory.delete(existFun.get());
        }
    }
}