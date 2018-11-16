package com.qa.persistance.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import com.qa.util.JSONUtil;
import com.qa.persistance.domain.Account;



@Transactional(SUPPORTS)
@Default 
public class AccountServiceDBImpl  implements AccountRepository
{
	
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	public String getAllAccounts() 
	{
		TypedQuery<Account> accounts = manager.createQuery("Select a FROM Account a",Account.class);
		return JSONUtil.getJSONForObject(accounts);
	}
	
	
	@Transactional(REQUIRED)
	public String addAccount(String account) 
	{
		Account anAccount = JSONUtil.getObjectForJSON(account, Account.class);
		manager.persist(anAccount);
		return "{\"message\": \"data added\"}";
	}

	
	@Transactional(REQUIRED)
	public String updateAccount(Long id, String accountToUpdate) 
	{
		Account updatedAccount = JSONUtil.getObjectForJSON(accountToUpdate, Account.class);
		Account accountFromDB = findAccount(id);
		accountFromDB = updatedAccount;
		manager.merge(accountFromDB);
		return "{\"message\": \"data added\"}";
	}
	
	@Transactional(REQUIRED)
	public String deleteAccount(Long id) 
	{
		Account accountInDB = findAccount(id);
		manager.remove(accountInDB);
		return "{\"message\": \"data added\"}";
	}
	
	
	private Account findAccount(Long id) 
	{
		return manager.find(Account.class, id);
	}

	public void setManager(EntityManager manager) 
	{
		this.manager = manager;
	}

	
	
}
