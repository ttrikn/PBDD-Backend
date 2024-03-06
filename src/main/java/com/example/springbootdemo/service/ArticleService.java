package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.Article;
import com.example.springbootdemo.pojo.PageBean;

public interface ArticleService {
    void add(Article article);

    PageBean<Article> list(Integer pageNum, Integer pageSize, String categoryId, String state);

    Article findById(Integer id);

    void update(Article article);

    void delete(Integer id);
}
