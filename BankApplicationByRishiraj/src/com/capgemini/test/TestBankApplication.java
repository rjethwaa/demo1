package com.capgemini.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.runners.MethodSorters;

import com.capgemini.beans.Account;
import com.capgemini.exception.InsufficientInitialAmountException;
import com.capgemini.exception.InvalidAccountNumberException;
import com.capgemini.repo.AccountRepo;
import com.capgemini.service.AccountService;
import com.capgemini.service.impl.AccountServiceImpl;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestBankApplication {
	@Mock
	 Account account;
	 AccountService accountService;
	 AccountRepo accountRepo;
	 
	@Before
	public void inittail()
	{
		
		MockitoAnnotations.initMocks(this);
		accountService = new AccountServiceImpl(accountRepo);
	}
	@Test
	public void test1()
	{
		AccountRepo accountRepo= null;
		accountService = new AccountServiceImpl(accountRepo);

	
		try {
			account =  accountService.createAccount(101, 5000);
		} catch (InsufficientInitialAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		


		
	}

	@Test
	public void test2()
	{
		int acc=101;
		int bal=500;
		try {
			int temp = accountService.depositAmount(account, bal);
			
			assertEquals(temp, 5500);
		} catch (InvalidAccountNumberException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
	}
	
	
/*	
*/





}
