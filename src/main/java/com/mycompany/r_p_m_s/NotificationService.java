/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r_p_m_s;

/**
 *
 * @author ga
 */
import java.util.List;

class NotificationService {

    private final Notifiable emailNotifier;

    // Constructor initializes the email notifier
    public NotificationService() {
        this.emailNotifier = new EmailNotification();
    }

    // Sends alerts via email to each recipient in the list
    public void sendAlerts(String message, List<String> recipients) {
        for (String recipient : recipients) {
            emailNotifier.sendNotification(message, recipient);
        }
    }
}
