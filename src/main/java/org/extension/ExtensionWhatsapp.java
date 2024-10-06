package org.extension;

import org.domingus.interfaces.NotificationPlatform;

public class ExtensionWhatsapp implements NotificationPlatform {

    @Override
    public void sendMessage(String message) {
        System.out.println("Soy Whatsapp y has recibido una notificacion!!");
        System.out.println(message);
    }

}