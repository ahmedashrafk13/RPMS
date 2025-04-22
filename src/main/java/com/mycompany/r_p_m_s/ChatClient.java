/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r_p_m_s;

/**
 *
 * @author ga
 */
class ChatClient {

    private final ChatServer chatServer;

    public ChatClient(ChatServer chatServer) {
        this.chatServer = chatServer;
    }

    // Opens the WhatsApp link in the user's browser
    public void startChat(String message) {
        String chatLink = chatServer.generateWhatsAppLink(message);
        System.out.println("🔗 Click the link to start chat: " + chatLink);

        try {
            // Opens the link in the default browser (works on most systems)
            java.awt.Desktop.getDesktop().browse(new java.net.URI(chatLink));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("❌ Unable to open browser. Please copy and paste the link manually.");
        }
    }
}

