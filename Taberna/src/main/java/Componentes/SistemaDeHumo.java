
package Componentes;

import EventBus.EventBus;
import Events.BandaTocandoEvent;

public class SistemaDeHumo {

    public SistemaDeHumo(EventBus bus) {
        bus.suscribir(BandaTocandoEvent.class, this::activarHumo);
    }

    private void activarHumo(BandaTocandoEvent e) {
        if (e.getNombreCancion().equalsIgnoreCase("Through the Fire and Flames")) {
            System.out.println("[Humo] 💨 Efectos de humo activados para canción épica!");
        }
    }
}
