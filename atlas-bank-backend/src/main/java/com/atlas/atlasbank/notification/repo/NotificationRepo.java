package com.atlas.atlasbank.notification.repo;

import com.atlas.atlasbank.notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NotificationRepo extends JpaRepository<Notification, Long> {
}
