package com.example.demo;

import java.util.List;

public interface InvitationService {
	
	public Invitation crearInvitacio(Invitation invitation);
	
	public List<Invitation> obtenirInvitacions();
	
	public Invitation obtenirInvitacioXId(Long id);
	
	public Invitation actualizarInvitacio(Invitation invitation);
	
	public void esborrarInvitacio(Long id);
	
	
}
