package com.example.demo.Service;

import com.example.demo.Model.Cake;
import com.example.demo.Repo.CakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CakeService {
@Autowired
CakeRepo cakeRepo;

public Iterable getAllCakes(){
    return cakeRepo.findAll();
}

}
