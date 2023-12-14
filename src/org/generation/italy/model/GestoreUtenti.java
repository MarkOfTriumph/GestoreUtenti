package org.generation.italy.model;

import java.util.ArrayList;

public class GestoreUtenti {
	ArrayList<Account> elencoAccount;
	
	
	//costruttore
	public GestoreUtenti()
	{
	 elencoAccount= new ArrayList<>();
	}
	
	 
	
	public boolean aggiungiUtente(Account acc)
	{
		
		if (!elencoAccount.contains(acc))
		{
			elencoAccount.add(acc);
			return true;
		}	 
			return false;
	}
	
	public boolean rimuoviUtente(String username)
	{
		for(int i=0;i<elencoAccount.size();i++)
		{
			if(elencoAccount.get(i).getUsername().equals(username))
			{
				elencoAccount.remove(i);
				return true;
			}
		}
		return false;
	}
	
	public Account loginUtente(String username, String password)
	{
		for(int i=0;i<elencoAccount.size();i++)
			if (elencoAccount.get(i).getUsername().equals(username) && elencoAccount.get(i).getPassword().equals(password))
				return elencoAccount.get(i) ;
		return null; 
	}
	
	public boolean resettaPassword(String username)
	{
		for(int i=0;i<elencoAccount.size();i++)
		{
			if(elencoAccount.get(i).getUsername().equals(username))
			{
				elencoAccount.get(i).setPassword("12345");
				return true;
			}
		}
		return false;
	}
	
	
	
}
