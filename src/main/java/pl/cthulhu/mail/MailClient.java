package pl.cthulhu.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Component;

@Component
public class MailClient {
	
	private JavaMailSender mailSender;
	
	@Autowired
	public void MailService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }
	
	public void prepareAndSend(String mail) {
	    MimeMessagePreparator messagePreparator = mimeMessage -> {
	        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage);
	        messageHelper.setFrom("josephmccourt.nwp@gmail.com");
	        messageHelper.setTo(mail);
	        messageHelper.setSubject("Witamy! New World Photo");
	        messageHelper.setText("Test");
	    };
	    try {
	        mailSender.send(messagePreparator);
	    } catch (MailException e) {
	    }
	}

}
