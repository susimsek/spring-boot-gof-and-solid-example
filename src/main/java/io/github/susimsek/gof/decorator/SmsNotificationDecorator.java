package io.github.susimsek.gof.decorator;

import io.github.susimsek.solid.srp.problem.INotification;

public class SmsNotificationDecorator extends NotificationDecorator {

    public SmsNotificationDecorator(INotification notification) {
        super(notification);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Send sms notification!");
    }
}