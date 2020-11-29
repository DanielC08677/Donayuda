package com.pascualbravo.donayuda.service.impl;

import com.pascualbravo.donayuda.models.entity.Donantes;
import com.pascualbravo.donayuda.models.entity.TipoDonacion;
import com.pascualbravo.donayuda.models.repositorio.DonantesRepository;
import com.pascualbravo.donayuda.models.repositorio.TipoDonacionRepository;
import com.pascualbravo.donayuda.service.iface.DonantesService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DonantesServiceImpl implements DonantesService {

    @Autowired
    private DonantesRepository donantesRepository;

    @Autowired
    private TipoDonacionRepository tipoDonacionRepository;

    @Override
    public void create(Donantes donantes) {
        Optional<TipoDonacion> exisTipo = tipoDonacionRepository.findById(donantes.getId_donancion().getId());
        if (exisTipo.isPresent()) {
            donantesRepository.save(donantes);
        }
    }

    @Override
    public List<Donantes> getAll() {
        List<Donantes> donantes = new ArrayList<>();
        donantesRepository.findAll().forEach(donantes::add);
        return donantes;
    }

    @Override
    public void update(int identificacion, Donantes donantes) {
        Optional<Donantes> existDonante = donantesRepository.findById(identificacion);
        if (existDonante.isPresent()) {
            existDonante.get().setNombre(donantes.getNombre());
            existDonante.get().setTel(donantes.getTel());

            Optional<TipoDonacion> existTdonante = tipoDonacionRepository.findById(donantes.getId_donancion().getId());
            if (existTdonante.isPresent()) {
                existDonante.get().setId_donancion(donantes.getId_donancion());
            }
            donantesRepository.save(existDonante.get());
        }

    }

    @Override
    public void delete(int identificacion) {
        Optional<Donantes> existDelete= donantesRepository.findById(identificacion);
        if(existDelete.isPresent())
        {
            donantesRepository.delete(existDelete.get());
        }

    }

}
