package com.capgemini.service.impl;

import com.capgemini.beans.Account;
import com.capgemini.exception.InsufficientBalanceException;
import com.capgemini.exception.InsufficientInitialAmountException;
import com.capgemini.exception.InvalidAccountNumberException;
import com.capgemini.repo.AccountRepo;
import com.capgemini.service.AccountService;

public class AccountServiceImpl implements AccountService {

	
	public AccountRepo accountRepo;
	public AccountServiceImpl(AccountRepo accountRepo)
	{
		this.accountRepo = accountRepo;
		
	}
	@Override
	public Account createAccount(int accountNumber, int amount) throws InsufficientInitialAmountException {
		// TODO Auto-generated method stubi

		if (amount < 500) {
			throw new InsufficientInitialAmountException();
		}
		
			Account account = new Account();
			account.setAccountNumber(accountNumber);
			account.setAmount(amount);
			if(accountRepo.save(account))
			{
				
				System.out.println("Account Created Successfully");
				return account;

			}
			
			
			return null;
		
	}

	@Override
	public int depositAmount(Account account1, int amount) {
		// TODO Auto-generated method stub
		Account account = new Account();
			System.out.println("::::"+account1.getAmount());
		
		
		account.setAmount(amount+account1.getAmount());
		
		return account.getAmount();
	}

	@Override
	public int withdrawAmount(int accountNumber, int amount)
			throws InvalidAccountNumberException, InsufficientBalanceException {
		// TODO Auto-generated method stub
		return 0;
	}

}
