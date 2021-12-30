package com.example.demoAspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    private Marks marks;
    public void show(){
        System.out.println("show method in Student Class");
        marks.show();
    }
    public void shown(){
        System.out.println("shown method in Student class");
    }
    public void notshow(){
        System.out.println("notshow method in Student class");
    }
}
