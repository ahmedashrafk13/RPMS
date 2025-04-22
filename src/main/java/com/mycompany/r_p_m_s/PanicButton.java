/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r_p_m_s;

/**
 *
 * @author ga
 */
class PanicButton {

    private Notifiable emailNotifier;

    public PanicButton(Notifiable emailNotifier) {
        this.emailNotifier = emailNotifier;
    }

    // Method to simulate the pressing of the panic button
    public void triggerPanicAlert(String patientName, String patientID, String email) {
        // Emergency message when panic button is pressed
        String panicMessage = "🚨 Urgent: Patient " + patientName + " (ID: " + patientID + ") has pressed the panic button! Immediate attention is required.";
        
        // Send the emergency email alert
        emailNotifier.sendNotification(panicMessage, email);
    }
}



