package com.diegoalmeida.cursosb.services;

import org.springframework.mail.SimpleMailMessage;

import com.diegoalmeida.cursosb.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);

	void sendEmail(SimpleMailMessage msg);

}
