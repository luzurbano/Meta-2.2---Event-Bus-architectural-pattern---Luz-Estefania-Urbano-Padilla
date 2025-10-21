
package Componentes;

import com.mycompany.taberna.EventBus;
import Events.BandaTocandoEvent;

public class SistemaDeSonido {
    public SistemaDeSonido(EventBus bus) {
        bus.suscribir(BandaTocandoEvent.class, this::ajustarSonido);
    }

    private void ajustarSonido(BandaTocandoEvent e) {
        System.out.println("[Sonido] Ajustando ecualizador para: " + e.nombreCancion());
    }
}


