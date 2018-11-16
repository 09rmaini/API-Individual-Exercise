package com.qa.business;

import javax.inject.Inject;

import com.qa.persistance.repository.*;

public class AccountServiceImpl implements AccountService
{
	
	@Inject
	private AccountRepository repo;

	public String getAllAccounts() {
		return repo.getAllAccounts();
	}

	public String addAccount(String account) {
		return repo.addAccount(account);
	}

	public String updateAccount(Long id, String account) {
		return repo.updateAccount(id, account);
	}

	public String deleteAccount(Long id) {
		return repo.deleteAccount(id);
	}


}
