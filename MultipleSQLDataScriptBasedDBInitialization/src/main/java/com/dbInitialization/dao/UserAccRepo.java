package com.dbInitialization.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbInitialization.model.UserAcc;

public interface UserAccRepo extends JpaRepository<UserAcc, Integer> {

}
