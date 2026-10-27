
package com.klef.soa.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.docker.entity.CraftWorkshopEntity;
import com.klef.soa.docker.service.CraftWorkshopService;

@CrossOrigin(origins = {
    "http://localhost:5173",
    "http://localhost:8082"
})
@RestController
public class CraftWorkshopController {

    @Autowired
    private CraftWorkshopService service;

    @GetMapping("/")
    public String home() {
        return "Crudservice is running";
    }

    @PostMapping("/Add")
    public CraftWorkshopEntity addCrud(
            @RequestBody CraftWorkshopEntity crud) {
        return service.addCrud(crud);
    }

    @GetMapping("/displayAll")
    public List<CraftWorkshopEntity> getAllCrud() {
        return service.getAllCrud();
    }

    @GetMapping("/displayById/{id}")
    public CraftWorkshopEntity displayById(
            @PathVariable Long id) {
        return service.displayById(id);
    }

    @PutMapping("/update/{id}")
    public CraftWorkshopEntity updateCrud(
            @PathVariable Long id,
            @RequestBody CraftWorkshopEntity crud) {
        return service.updateCrud(id, crud);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCrud(@PathVariable Long id) {
        return service.deleteCrud(id);
    }
}
