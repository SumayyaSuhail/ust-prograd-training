package com.beans.factoryBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FactoryOne {
    @Autowired
    public FactoryTwo factoryTwo;
    public void show(){
        factoryTwo.display();
    }
}
