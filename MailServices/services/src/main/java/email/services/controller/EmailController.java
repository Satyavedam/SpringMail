package email.services.controller;

import org.springframework.beans.factory.annotation.Autowired;

import email.services.entity.EmailEntity;
import email.services.service.EmailService;

@RestController
public class EmailController {
	@Autowired
	private EmailService emailService;

	// Sending a simple Email
	@PostMapping("/sendMail")
	public String sendMail(@RequestBody EmailEntity details) {
		String status = emailService.sendSimpleMail(details);

		return status;
	}
   //Sending mail with attachment 
	@PostMapping("/sendMailWithAttachment")
	public String sendMailWithAttachment(@RequestBody EmailEntity details) {
		String status = emailService.sendMailWithAttachment(details);

		return status;
	}

}
