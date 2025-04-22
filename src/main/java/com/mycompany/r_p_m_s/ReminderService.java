/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r_p_m_s;

/**
 *
 * @author ga
 */
class ReminderService {

    private Notifiable emailNotifier;

    public ReminderService(Notifiable emailNotifier) {
        this.emailNotifier = emailNotifier;
    }

    public void sendAppointmentReminder(String patientName, String appointmentDateTime, String email) {
        String message = "📅 Hello " + patientName + ", this is a reminder for your appointment on " + appointmentDateTime + ".";
        emailNotifier.sendNotification(message, email);
    }

    public void sendMedicationReminder(String patientName, String medicationDetails, String email) {
        String message = "💊 Hello " + patientName + ", it's time to take your medication: " + medicationDetails + ".";
        emailNotifier.sendNotification(message, email);
    }
}
