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

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCognome() {
	return cognome;
}

public void setCognome(String cognome) {
	this.cognome = cognome;
}

@Override
public String toString() {
	return "Account [username=" + username + ", password=" + password + ", nome=" + nome + ", cognome=" + cognome + "]";
}
}


