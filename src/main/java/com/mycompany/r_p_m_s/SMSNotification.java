/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r_p_m_s;

/**
 *
 * @author ga
 */

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

class SMSNotification implements Notifiable {

    // Replace with your Twilio credentials
    public static final String ACCOUNT_SID = "ACc345d0a7ad942259ace818af4b1dda21";
    public static final String AUTH_TOKEN = "2326b517a449a7a1efbf65c91c364446";
    public static final String TWILIO_PHONE_NUMBER = "+19706603801"; // Your Twilio phone number

    static {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }

    @Override
    public void sendNotification(String message, String recipient) {
        Message sms = Message.creator(
                new PhoneNumber(recipient),         // To: user number
                new PhoneNumber(TWILIO_PHONE_NUMBER), // From: Twilio number
                message
        ).create();

        System.out.println("✅ SMS sent to " + recipient + ": SID = " + sms.getSid());
    }
}
