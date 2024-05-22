package com.example.demo.mapper;

import com.example.demo.entity.Person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PersonMapper {

    @Select("SELECT * FROM person")
    List<Person> findAll();

    @Insert("INSERT INTO person(name, prefecture, capital) VALUES(#{name}, #{prefecture}, #{capital})")
    void insert(Person person);
}
