package com.example.demo.Controller;

import com.example.demo.Model.Cake;
import com.example.demo.Repo.CakeRepo;
import com.example.demo.Service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CakeController {

    @Autowired
    CakeRepo cakeRepo;
    @Autowired
    CakeService cakeService;

    @CrossOrigin(origins = "https://localhost:8080")
    @GetMapping("/cakes")
    public Iterable getAllcakes() {
        return cakeService.getAllCakes();
    }

    @PostMapping("/cake")
    public Cake createCake(@RequestBody Cake cake) {
        return cakeService.createCake(cake);
    }

    @PutMapping("/cake/{id}")
    public Optional<Cake> updateCake(@RequestBody Cake newCake, @PathVariable Long id) {
        Optional<Cake> updateCake = cakeRepo.findById(id).map(cake -> {
            cake.setFrosted(newCake.isFrosted());
            cake.setName(newCake.getName());
            return cakeRepo.save(cake);

        });
        return cakeRepo.findById(id);
    }

    @DeleteMapping("/cake/{id}")
    public void deleteCake(@PathVariable Long id) {
        cakeService.deleteCake(id);
    }

    @GetMapping("/cake/{id}")
    public Optional<Cake> getCake(@PathVariable Long id) {
        return cakeService.getCake(id);
    }
}


