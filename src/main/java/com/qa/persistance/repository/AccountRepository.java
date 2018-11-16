package com.qa.persistance.repository;

public interface AccountRepository 
{

	String getAllAccounts();
	
	String addAccount(String account);
	
	String updateAccount(Long id, String accountToUpdate);
	
	String deleteAccount(Long id);
	
	
}
