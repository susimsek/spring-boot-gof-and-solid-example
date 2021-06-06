package io.github.susimsek.gof.decorator;

import io.github.susimsek.solid.srp.problem.INotification;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PROTECTED)
public abstract class NotificationDecorator implements INotification {

    final INotification iNotification;

    public NotificationDecorator(INotification iNotification) {
        this.iNotification = iNotification;
    }

    @Override
    public void sendMessage() {
        iNotification.sendMessage();
    }
}