package io.github.susimsek.solid.srp.problem;

import org.springframework.stereotype.Component;


public class MailAndSmsNotification implements INotification {
    @Override
    public void sendMessage() {
        System.out.println("Send mail notification!");
        System.out.println("Send sms notification!");
    }
}