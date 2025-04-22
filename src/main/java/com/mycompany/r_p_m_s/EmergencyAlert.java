/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r_p_m_s;

/**
 *
 * @author ga
 */
class EmergencyAlert {

    private Notifiable emailNotifier;

    public EmergencyAlert(Notifiable emailNotifier) {
        this.emailNotifier = emailNotifier;
    }

    // Method to check if vitals exceed the critical threshold
    public void checkVitalsAndAlert(String patientName, int heartRate, int systolicBP, int diastolicBP, String email) {
        String alertMessage = "";
        
        // Check critical heart rate
        if (heartRate > 120) {
            alertMessage += "❗ Critical: Heart rate is too high (" + heartRate + " BPM). ";
        }

        // Check critical blood pressure
        if (systolicBP > 180 || diastolicBP > 120) {
            alertMessage += "❗ Critical: Blood pressure is too high (" + systolicBP + "/" + diastolicBP + " mmHg). ";
        }

        // If there are any critical conditions, send alert
        if (!alertMessage.isEmpty()) {
            alertMessage = "🚨 Emergency Alert for " + patientName + ": " + alertMessage;
            emailNotifier.sendNotification(alertMessage, email);
        }
    }
}
