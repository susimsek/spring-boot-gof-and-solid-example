package io.github.susimsek.solid.srp.problem;

public class NotificationService {

    public void sendMessage() {
//        MailNotification notification = new MailNotification();
//        SlackNotification notification = new SlackNotification();
        MailAndSlackNotification notification = new MailAndSlackNotification();
        notification.sendMessage();
    }
}