package com.springApp.springJdbcTransactionsDeclar.dao;

import com.springApp.springJdbcTransactionsDeclar.model.Developer;
import com.springApp.springJdbcTransactionsDeclar.model.Project;

import java.util.List;

/**
 * Interface for Developer DAO
 * @author Ihor Savchenko
 * @version 1.0
 */
public interface DeveloperDao {

    void createDeveloper(String name, String speciality, Integer experience);

    List<Developer> listDevelopers();

    List<Project> listDevelopersProjects(Integer id);

}
