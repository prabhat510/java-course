package org.example;

public class Alien implements Computer {
    private int age;
    private Computer com;

//    public Laptop getLap() {
//        return lap;
//    }
    public void code() {
        System.out.println("coding");
        com.compile();
    }
    public Computer getCom() {
        return com;
    }
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void compile() {
        System.out.println("compile overridden");
    }
}
