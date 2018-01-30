package com.capgemini.repository;

import com.capgemini.model.Account;

/**
 * @author rjethwa
 *
 */
public interface AccountRepository {
	
	boolean save(Account account);
	
	Account searchAccount(int accountNumber);
	


}
