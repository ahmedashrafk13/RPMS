/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r_p_m_s;

/**
 *
 * @author ga
 */
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

class VideoCall {
    private String meetingLink;

    public VideoCall(String meetingLink) {
        if (isValidLink(meetingLink)) {
            this.meetingLink = meetingLink;
        } else {
            throw new IllegalArgumentException("❌ Invalid meeting link.");
        }
    }

    public void startCall() {
        System.out.println("📞 Starting video call...");
        System.out.println("🔗 Join the meeting at: " + meetingLink);

        // Attempt to open link in default browser
        if (Desktop.isDesktopSupported()) {
            try {
                Desktop.getDesktop().browse(new URI(meetingLink));
                System.out.println("🌐 Opening browser...");
            } catch (IOException | URISyntaxException e) {
                System.out.println("⚠️ Unable to open browser: " + e.getMessage());
            }
        }
    }

    public String getMeetingLink() {
        return meetingLink;
    }

    public void setMeetingLink(String meetingLink) {
        if (isValidLink(meetingLink)) {
            this.meetingLink = meetingLink;
        } else {
            System.out.println("❌ Invalid meeting link.");
        }
    }

    private boolean isValidLink(String link) {
        return link != null && (link.startsWith("https://meet.google.com") || link.startsWith("https://zoom.us"));
    }
}

