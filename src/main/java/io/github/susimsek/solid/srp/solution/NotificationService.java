package io.github.susimsek.solid.srp.solution;

import io.github.susimsek.gof.decorator.SlackNotificationDecorator;
import io.github.susimsek.gof.decorator.SmsNotificationDecorator;
import io.github.susimsek.solid.srp.problem.INotification;

public class NotificationService {

    public void sendMessage() {
//        MailNotification notification = new MailNotification();
//        SlackNotification notification = new SlackNotification();
        INotification notification =
                new SmsNotificationDecorator(
                        new SlackNotificationDecorator(new BaseNotification()));
        notification.sendMessage();
    }
}