package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
@Entity
public class Transaction {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private int id;
	 private String action;
	 private long amount;
	 private long accountNum;
	 @NotNull
	 @Size(min=2, max=30)
	 private String reason;
	 public long getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAccountNum() {
		return accountNum;
	}
	public void setAccountNum(long accountNum) {
		this.accountNum = accountNum;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}


}
