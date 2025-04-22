/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r_p_m_s;

/**
 *
 * @author ga
 */
import java.util.Properties;
import jakarta.mail.*;
import jakarta.mail.internet.*;







class EmailNotification implements Notifiable {

    private static final String FROM_EMAIL = "ahmedashrafk12@gmail.com"; // your email
    private static final String PASSWORD = "ugiy mtqc fuhg fpfu"; // use Gmail App Password

    @Override
    public void sendNotification(String message, String recipient) {
        // SMTP config
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        // Auth session
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM_EMAIL, PASSWORD);
            }
        });

        try {
            // Compose the email
            jakarta.mail.Message email = new MimeMessage(session);
            email.setFrom(new InternetAddress(FROM_EMAIL));
            email.setRecipients(jakarta.mail.Message.RecipientType.TO, InternetAddress.parse(recipient));
            email.setSubject("📧 Emergency Notification");
            email.setText(message);

            Transport.send(email);
            System.out.println("✅ Email sent to " + recipient);

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("❌ Failed to send email to " + recipient);
        }
    }
}

