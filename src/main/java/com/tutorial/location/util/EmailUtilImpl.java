package com.tutorial.location.util;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

@Component
public class EmailUtilImpl implements EmailUtil {

	@Autowired
	JavaMailSender sender;

	@Override
	public void sendEmail(String toAddress, String subject, String body) {

		try {
			MimeMessage message = sender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message);

			helper.setTo(toAddress);
			helper.setSubject(subject);
			helper.setText(body);

			sender.send(message);

		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

}
