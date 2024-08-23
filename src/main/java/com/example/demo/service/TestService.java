package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class TestService {

//    public void doWork(){
//        System.out.println(getClass()+" : do my work here");
//    }

    public void set(){
        System.out.println("inside setter method of test service");
    }
}
