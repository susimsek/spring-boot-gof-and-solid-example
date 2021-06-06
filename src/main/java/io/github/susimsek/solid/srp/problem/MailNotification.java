package io.github.susimsek.solid.srp.problem;


public class MailNotification implements INotification {
    @Override
    public void sendMessage() {
        System.out.println("Send mail notification!");
    }
}