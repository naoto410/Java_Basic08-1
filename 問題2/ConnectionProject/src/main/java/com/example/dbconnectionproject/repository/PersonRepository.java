package com.example.dbconnectionproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.dbconnectionproject.entity.Person;
public interface PersonRepository extends JpaRepository<Person, Long> {

}