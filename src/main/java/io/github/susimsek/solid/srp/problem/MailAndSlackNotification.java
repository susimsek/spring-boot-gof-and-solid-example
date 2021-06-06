package io.github.susimsek.solid.srp.problem;

public class MailAndSlackNotification implements INotification {
    @Override
    public void sendMessage() {
        System.out.println("Send mail notification!");
        System.out.println("Send slack notification!");
    }
}