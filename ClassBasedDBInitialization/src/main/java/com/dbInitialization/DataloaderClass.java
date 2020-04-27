package com.dbInitialization;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dbInitialization.dao.BankAccountRepo;
import com.dbInitialization.model.BankAccount;
/**
 * 
 * @author TA
 * DataloaderClass gets loaded that the start of application and updates the database with data entered in run() method of CommandLinerRunner interface.
 *
 */
@Component
public class DataloaderClass implements CommandLineRunner {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DataloaderClass.class);
	
	@Autowired
	private BankAccountRepo bankAccountRepo;
	

	@Override
	public void run(String... args) throws Exception {
		this.bankAccountRepo.deleteAll();
		
		BankAccount bankAccount1 = new BankAccount("ownerName1", 100011);
		BankAccount bankAccount2 = new BankAccount("ownerName2", 100022);
		BankAccount bankAccount3 = new BankAccount("ownerName3", 100033);
		
		this.bankAccountRepo.save(bankAccount1);
		this.bankAccountRepo.save(bankAccount2);
		this.bankAccountRepo.save(bankAccount3);
		
		LOGGER.info("Database has been initialized");
	}

}
