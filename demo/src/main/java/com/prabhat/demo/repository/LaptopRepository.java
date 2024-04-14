package com.prabhat.demo.repository;

import com.prabhat.demo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("saved in database..");
    }
}
