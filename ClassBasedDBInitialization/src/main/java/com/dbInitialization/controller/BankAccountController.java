package com.dbInitialization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbInitialization.dao.BankAccountRepo;
import com.dbInitialization.model.BankAccount;

@RestController
public class BankAccountController {
	
	@Autowired
	private BankAccountRepo bankAccountRepo;
	
	@GetMapping("all")
	public List<BankAccount> getAllAccountDetails() {
		return bankAccountRepo.findAll();
	}
}
