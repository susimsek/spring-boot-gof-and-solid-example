package io.github.susimsek.solid.srp.problem;

/*
 We have to create a lot of classes(EmailAndSmsNotification.java, SlackAndEmailNotification.java, EmailAndSlackAndSmsNotificaton.java) that violate SR
 */
public class UseCaseExample {

    public static void main(String[] args) {
        System.out.println("*******************************");
        final NotificationService notificationService = new NotificationService();
        notificationService.sendMessage();
    }
}