package com.capgemini.repo;

import com.capgemini.beans.Account;

/**
 * @author rjethwa
 *
 */
public interface AccountRepo {

	/**
	 * @param acc
	 * @return
	 */
	boolean save(Account acc);

	/**
	 * @param accountNumber
	 * @return
	 */
	Account searchAccount(int accountNumber);

}
