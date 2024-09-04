package com.crudapplication.crud.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crudapplication.crud.model.User;

public interface UserDao extends JpaRepository<User, Long>{

}
