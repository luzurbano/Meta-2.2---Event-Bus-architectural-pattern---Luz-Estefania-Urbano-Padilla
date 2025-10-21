
package Componentes;

import Events.BandaTocandoEvent;
import Events.BebidaServidaEvent;
import Events.ComidaPreparadaEvent;
import com.mycompany.taberna.EventBus;

public class PanelLED {
    public PanelLED(EventBus bus) {
        bus.suscribir(BebidaServidaEvent.class, e -> 
            System.out.println("[PANEL LED] Nueva bebida servida en la mesa " + e.mesaId() + ": " + e.bebida() + "!"));
        bus.suscribir(ComidaPreparadaEvent.class, e -> 
            System.out.println("[PANEL LED] Comida lista para pedido " + e.pedidoId() + ": " + e.plato() + "!"));
        bus.suscribir(BandaTocandoEvent.class, e -> 
            System.out.println("[PANEL LED] La banda " + e.nombreBanda() + " está tocando " + e.nombreCancion() + "!"));
    }
}
