package org.generation.italy.model;

public class User extends Account {
	protected String dataRegistrazione,nrTelefono;

	@Override
	public String toString() {
		return "User [dataRegistrazione=" + dataRegistrazione + ", nrTelefono=" + nrTelefono + ", username=" + username
				+ ", password=" + password + ", nome=" + nome + ", cognome=" + cognome + "]";
	}

	

	
}
