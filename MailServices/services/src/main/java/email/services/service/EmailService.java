package email.services.service;

import email.services.entity.EmailEntity;

public interface EmailService {
	   // To send a simple mail
	 String sendSimpleMail(EmailEntity details);
	 
	 
	    // To send an email with attachment
	 String sendMailWithAttachment(EmailEntity details);
	}
	
