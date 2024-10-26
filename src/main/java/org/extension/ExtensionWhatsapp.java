package org.extension;

import org.domingus.interfaces.Observer;

public class ExtensionWhatsapp implements Observer {

    @Override
    public void update(Object message) {
        System.out.println("Soy Whatsapp y has recibido una notificacion!!");
        System.out.println(message);
    }
}