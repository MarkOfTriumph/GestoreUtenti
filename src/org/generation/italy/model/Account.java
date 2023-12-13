package org.generation.italy.model;

public class Account {
protected String username,password,nome,cognome;

public boolean cambiaPassword( String vecchiaPassword, String nuovaPassword, String confermaNuovaPassword)
{
	
	if (this.password.equals(vecchiaPassword))
	{
		do
		{
		if(nuovaPassword.equals(confermaNuovaPassword))
			{
			this.password=nuovaPassword;
			break;
			}
		}		
		while(true);		
	return true;
	}
	else
		return false;
}

@Override
public String toString() {
	return "Account [username=" + username + ", password=" + password + ", nome=" + nome + ", cognome=" + cognome + "]";
}
}


