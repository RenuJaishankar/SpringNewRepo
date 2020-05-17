package com.example.demo.Service;

import com.example.demo.Model.Cake;
import com.example.demo.Repo.CakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CakeService {

    @Autowired
    CakeRepo cakeRepo;

public Iterable getAllCakes(){

    return cakeRepo.findAll();
}

public Optional<Cake> getCake(Long id){
    return cakeRepo.findById(id);
}

public void deleteCake(Long id){
    cakeRepo.deleteById(id);
}

public Optional<Cake> updateCake(Long id){
    return cakeRepo.findById(id);
}

public Cake createCake(Cake cake){
    return cakeRepo.save(cake);
}

}
