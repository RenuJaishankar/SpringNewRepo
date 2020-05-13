package com.example.demo;

import com.example.demo.Model.Cake;
import com.example.demo.Repo.CakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class runner implements CommandLineRunner {
   @Autowired
    CakeRepo cakeRepo;
  @Override
  public void run (String ...args) throws Exception{
    cakeRepo.save(new Cake("ButterCake",true));
    cakeRepo.save(new Cake("PoundCake",false));
    cakeRepo.save(new Cake("SpongeCake",false));
    cakeRepo.save(new Cake("VanillaCake ",true));
    cakeRepo.save(new Cake("GenoiseCake",false));
    cakeRepo.save(new Cake("BiscuitCake",false));

  }

}
