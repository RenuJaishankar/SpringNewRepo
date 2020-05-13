package com.example.demo.Controller;

import com.example.demo.Repo.CakeRepo;
import com.example.demo.Service.CakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CakeController {
@Autowired
CakeRepo cakeRepo;
@Autowired
CakeService cakeService;

@GetMapping("/cakes")
public Iterable getAllcakes(){
    return cakeService.getAllCakes();
}

}
