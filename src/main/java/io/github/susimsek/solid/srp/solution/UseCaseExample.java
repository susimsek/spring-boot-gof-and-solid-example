package io.github.susimsek.solid.srp.solution;

import io.github.susimsek.solid.srp.problem.NotificationService;

/*
Now, when we change logic sending the notification, we will only edit one line in NotificationService.java file. That is a good solution and the code complies with SRP completely.
 */
public class UseCaseExample {

    public static void main(String[] args) {
        System.out.println("*******************************");
        final io.github.susimsek.solid.srp.problem.NotificationService notificationService = new NotificationService();
        notificationService.sendMessage();
    }
}