package io.github.susimsek.solid.srp.problem;

public class SmsNotification implements INotification {
    @Override
    public void sendMessage() {
        System.out.println("Send sms notification!");
    }
}