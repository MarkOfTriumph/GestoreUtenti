package org.generation.italy.model;

public class Administrator extends Account {
	protected int codiceBadge;
	
	public Administrator(String username, String password, String nome, String cognome, int codiceBadge) {
		super(username, password, nome, cognome);
		this.codiceBadge=codiceBadge;
	}

	@Override
	public String toString() {
		return "Administrator [codiceBadge=" + codiceBadge + ", username=" + username + ", password=" + password
				+ ", nome=" + nome + ", cognome=" + cognome + "]";
	}





	

	
	
	

}
