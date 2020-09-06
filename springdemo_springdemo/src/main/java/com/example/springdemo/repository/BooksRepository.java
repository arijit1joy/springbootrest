package com.example.springdemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springdemo.models.Books;

public interface BooksRepository extends CrudRepository<Books, Integer>{

}
