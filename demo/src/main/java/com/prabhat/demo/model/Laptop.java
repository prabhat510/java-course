package com.prabhat.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile() {
        System.out.println("compiling in Laptop");
    }
}
