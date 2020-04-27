package com.dbInitialization.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dbInitialization.dao.BankAccountRepo;
import com.dbInitialization.dao.UserAccRepo;
import com.dbInitialization.model.BankAccount;
import com.dbInitialization.model.UserAcc;

@RestController
public class MainAccountController {
	
	@Autowired
	private BankAccountRepo bankAccountRepo;
	
	@Autowired
	private UserAccRepo userAccRepo;
	
	@GetMapping("allBankAcc")
	public List<BankAccount> getAllBankAccountDetails() {
		return bankAccountRepo.findAll();
	}
	
	@GetMapping("allUserAcc")
	public List<UserAcc> getAllUserAccountDetails() {
		return userAccRepo.findAll();
	}
}
