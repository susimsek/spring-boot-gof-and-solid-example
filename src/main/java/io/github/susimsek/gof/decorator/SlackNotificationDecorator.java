package io.github.susimsek.gof.decorator;

import io.github.susimsek.solid.srp.problem.INotification;


public class SlackNotificationDecorator extends NotificationDecorator {

    public SlackNotificationDecorator(INotification notification) {
        super(notification);
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("Send slack notification!");
    }
}
