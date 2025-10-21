
package Componentes;

import com.mycompany.taberna.EventBus;
import Events.BandaTocandoEvent;

public class SistemaDeHumo {
    public SistemaDeHumo(EventBus bus) {
        bus.suscribir(BandaTocandoEvent.class, this::activarHumo);
    }

    private void activarHumo(BandaTocandoEvent e) {
        if (e.nombreCancion().equalsIgnoreCase("Through the Fire and Flames")) {
            System.out.println("[Humo] Efectos de humo activados para canción épica!");
        }
    }
}

