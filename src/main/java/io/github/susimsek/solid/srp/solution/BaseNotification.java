package io.github.susimsek.solid.srp.solution;

import io.github.susimsek.solid.srp.problem.INotification;


public class BaseNotification implements INotification {

    @Override
    public void sendMessage() {
        System.out.println("Send mail notification!");
    }
}