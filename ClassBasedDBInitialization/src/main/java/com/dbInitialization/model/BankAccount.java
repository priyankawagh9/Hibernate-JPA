package com.dbInitialization.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table
@NoArgsConstructor
public class BankAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long accountNo;
	
	private String ownerName;

	private long balance;
	
	
	public BankAccount(String ownerName, long balance) {
		this.ownerName = ownerName;
		this.balance = balance;
	}
}
