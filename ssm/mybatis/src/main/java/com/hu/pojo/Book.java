package com.hu.pojo;

public class Book {
    private  Integer id;

    public Book() {
    }
    private String Name;

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }

    public Book(Integer id, String name) {
        this.id = id;
        Name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getbOOKName() {
        return Name;
    }

    public void setBOokName(String name) {
        Name = name;
    }
}
