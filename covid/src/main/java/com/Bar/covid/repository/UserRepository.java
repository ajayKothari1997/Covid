package com.Bar.covid.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Bar.covid.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
