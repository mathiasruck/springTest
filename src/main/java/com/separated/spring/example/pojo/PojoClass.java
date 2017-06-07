package com.separated.spring.example.pojo;

import org.springframework.stereotype.Service;

@Service
public class PojoClass {

    private String name;
    private String lastName;

    public PojoClass(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SimplePojo{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
