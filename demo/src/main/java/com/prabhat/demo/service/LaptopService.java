package com.prabhat.demo.service;

import com.prabhat.demo.model.Laptop;
import com.prabhat.demo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    LaptopRepository repo;
    public void addLaptop(Laptop lap) {
        System.out.println("method called");
        repo.save(lap);
    }

    public boolean isGoodForCoding() {
        return true;
    }
}
