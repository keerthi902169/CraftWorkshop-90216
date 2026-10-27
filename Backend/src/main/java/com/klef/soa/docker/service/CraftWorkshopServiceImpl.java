
package com.klef.soa.docker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.docker.entity.CraftWorkshopEntity;
import com.klef.soa.docker.repository.CraftWorkshopRepository;

@Service
public class CraftWorkshopServiceImpl implements CraftWorkshopService {

    @Autowired
    private CraftWorkshopRepository repo;

    @Override
    public CraftWorkshopEntity addCrud(CraftWorkshopEntity crud) {
      
        return repo.save(crud);
    }

    @Override
    public List<CraftWorkshopEntity> getAllCrud() {
        return repo.findAll();
    }

    @Override
    public CraftWorkshopEntity displayById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public CraftWorkshopEntity updateCrud(
            Long id, CraftWorkshopEntity crud) {

        CraftWorkshopEntity existing = repo.findById(id).orElse(null);

        if (existing != null) {
            existing.setClassName(crud.getClassName());
            existing.setMaterialCost(crud.getMaterialCost());
            existing.setParticipantCount(crud.getParticipantCount());
            existing.setCompleted(crud.getCompleted());

            return repo.save(existing);
        }

        return null;
    }

    @Override
    public String deleteCrud(Long id) {

        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Record deleted";
        }

        return "Record not found";
    }
}
