package com.springboot.service;

import com.springboot.entity.People;

import java.util.List;

/**
 * @author Louis
 * @title: PeopleService
 * @projectName springbootstudy
 * @description: TODO
 * @date 2019/5/28 10:38
 */
public interface PeopleService {

    void save(People people);

    void delete(Integer id);

    People update(People people);

    List<People> findAll();

    People findById(Integer id);

}
