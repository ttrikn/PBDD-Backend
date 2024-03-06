package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.Category;

import java.util.List;


public interface CategoryService {
    void add(Category category);

    List<Category> list();

    Category findById(Integer id);

    void update(Category category);

    void delete(Integer id);
}
