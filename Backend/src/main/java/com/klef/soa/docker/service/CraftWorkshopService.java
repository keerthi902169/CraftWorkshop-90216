
package com.klef.soa.docker.service;

import java.util.List;

import com.klef.soa.docker.entity.CraftWorkshopEntity;

public interface CraftWorkshopService {

    CraftWorkshopEntity addCrud(CraftWorkshopEntity crud);

    List<CraftWorkshopEntity> getAllCrud();

    CraftWorkshopEntity displayById(Long id);

    CraftWorkshopEntity updateCrud(Long id, CraftWorkshopEntity crud);

    String deleteCrud(Long id);
}
