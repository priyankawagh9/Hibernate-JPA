package com.dbInitialization.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long accountno;
	
	private String owner;

	private long balance;
	
	
	public BankAccount(String ownerName, long balance) {
		this.owner = ownerName;
		this.balance = balance;
	}
}
