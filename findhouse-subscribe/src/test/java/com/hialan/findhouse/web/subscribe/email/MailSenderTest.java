package com.hialan.findhouse.web.subscribe.email;


import org.junit.Test;

/**
 * User: Alan
 * Email:alan@hialan.com
 * Date: 3/20/15 13:45
 */
public class MailSenderTest {
	@Test
	public void testSendMail() throws Exception{
		MailSender mailSender = new MailSender();
		Email email = new Email();
		email.setContent("test");
		mailSender.createSession(new HiAlanMailAuthenticator("", "")).buildMsg(email).sendMail();
	}
}
