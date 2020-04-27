package com.dbInitialization.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dbInitialization.model.BankAccount;

public interface BankAccountRepo extends JpaRepository<BankAccount, Long>{

}
