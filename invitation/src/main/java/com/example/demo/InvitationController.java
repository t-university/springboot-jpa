package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.InvitationServiceImpl;

@RestController
@RequestMapping("/api")
public class InvitationController {
	@Autowired
	InvitationServiceImpl invitationServiceImpl;
	
	@PostMapping("/invitations")
	public Invitation crearInvitacio(@RequestBody Invitation invitation) {
		return invitationServiceImpl.crearInvitacio(invitation);
	}
	
	@GetMapping("/invitations")
	public List<Invitation> obtenirInvitacions() {
		return invitationServiceImpl.obtenirInvitacions();
	}
	
	@GetMapping("/invitations/{id}")
	public Invitation obtenirInvitacioXId(@PathVariable(name="id") Long id) {
		return invitationServiceImpl.obtenirInvitacioXId(id);
	}
	
	@PutMapping("/invitations/{id}")
	public Invitation actualizarInvitacio(@PathVariable(name="id")Long id,Invitation invitation) {
		Invitation ptInvitation = new Invitation();
		
		ptInvitation = invitationServiceImpl.obtenirInvitacioXId(id);
		
		ptInvitation.setUsername(invitation.getUsername());
		ptInvitation.setCreationDate(invitation.getCreationDate());
		ptInvitation.setLimitDate(invitation.getLimitDate());
		
		return invitationServiceImpl.actualizarInvitacio(ptInvitation);
	}
	
	@DeleteMapping("/invitations/{id}")
	public void esborrarInvitacio(@PathVariable(name="id") Long id) {
		invitationServiceImpl.esborrarInvitacio(id);
	}
}
