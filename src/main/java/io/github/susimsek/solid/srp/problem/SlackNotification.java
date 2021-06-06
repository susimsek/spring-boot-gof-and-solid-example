package io.github.susimsek.solid.srp.problem;

public class SlackNotification implements INotification {
    @Override
    public void sendMessage() {
        System.out.println("Send slack notification!");
    }
}