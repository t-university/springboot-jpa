package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class InvitationServiceImpl implements InvitationService{
	
	@Autowired
	InvitationRepository invitationRepository;

	@Override
	public Invitation crearInvitacio(Invitation invitation) {
		return invitationRepository.save(invitation);
	}

	@Override
	public List<Invitation> obtenirInvitacions() {
		return invitationRepository.findAll();
	}

	@Override
	public Invitation obtenirInvitacioXId(Long id) {
		return invitationRepository.findById(id).get();
	}

	@Override
	public Invitation actualizarInvitacio(Invitation invitation) {
		return invitationRepository.save(invitation);
	}

	@Override
	public void esborrarInvitacio(Long id) {
		invitationRepository.deleteById(id);
		
	}

}
