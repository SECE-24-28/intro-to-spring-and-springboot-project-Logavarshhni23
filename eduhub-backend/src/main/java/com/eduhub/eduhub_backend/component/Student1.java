package com.eduhub.eduhub_backend.component;

import org.springframework.stereotype.Component;

@Component
public class Student1 {
    public void study(){
        System.out.println("I am doing Engineering");
    }

    public Student1(){
        System.out.println("Student object has created");
    }

}
