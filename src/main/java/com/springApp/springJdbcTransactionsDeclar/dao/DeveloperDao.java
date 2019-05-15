package com.springApp.springJdbcTransactionsDeclar.dao;


import com.springApp.springJdbcTransactionsDeclar.model.Developer;
import com.springApp.springJdbcTransactionsDeclar.model.Project;

import java.util.List;

public interface DeveloperDao {

    void createDeveloper(String name, String speciality, Integer experience);

    List<Developer> listDevelopers();

    List<Project> listDevelopersProjects(Integer id);

}
