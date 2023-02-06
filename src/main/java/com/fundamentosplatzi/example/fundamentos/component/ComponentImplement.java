package com.fundamentosplatzi.example.fundamentos.component;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class ComponentImplement implements ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("Hola mundo desde mi component");
    }
}
