package com.philsco.emailsender.service;

public interface EmailSenderService {
    void sendEmail(String to, String subject,String message);
}
