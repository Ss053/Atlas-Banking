package com.atlas.atlasbank.notification.services;

import com.atlas.atlasbank.auth_users.entity.User;
import com.atlas.atlasbank.notification.dtos.NotificationDTO;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO, User user);
}
