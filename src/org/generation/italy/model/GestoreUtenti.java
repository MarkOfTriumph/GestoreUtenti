package org.generation.italy.model;

import java.util.ArrayList;

public class GestoreUtenti {
	ArrayList<Account> elencoAccount;
	GestoreUtenti()
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
		else 
			return false;
	}
	
	public boolean rimuoviUtente(String username)
	{
		for(int i=0;i<elencoAccount.size();i++)
			if(elencoAccount[i].)
	}
	
	
}
