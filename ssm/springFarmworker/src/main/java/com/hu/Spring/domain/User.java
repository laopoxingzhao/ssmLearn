package com.hu.Spring.domain;

import java.util.List;
import java.util.Map;

public class User {
    List<String> name;
    Map<String,Integer> age;

    public User(List<String> name, Map<String, Integer> age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }

    public List<String> getName() {
        return name;
    }

    public void setName(List<String> name) {
        this.name = name;
    }

    public Map<String, Integer> getAge() {
        return age;
    }

    public void setAge(Map<String, Integer> age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
