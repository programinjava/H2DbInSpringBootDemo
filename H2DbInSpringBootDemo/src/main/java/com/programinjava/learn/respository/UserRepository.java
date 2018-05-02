package com.programinjava.learn.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.programinjava.learn.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{

}
