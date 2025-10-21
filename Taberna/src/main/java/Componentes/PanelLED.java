
package Componentes;

import Events.BandaTocandoEvent;
import Events.BebidaServidaEvent;
import Events.ComidaPreparadaEvent;
import EventBus.EventBus;

public class PanelLED {

    public PanelLED(EventBus bus) {
        bus.suscribir(BebidaServidaEvent.class, e
                -> System.out.println("[PANEL LED] Nueva bebida servida en la mesa " + e.getMesaId() + ": " + e.getBebida() + "!"));
        bus.suscribir(ComidaPreparadaEvent.class, e
                -> System.out.println("[PANEL LED] Comida lista para pedido " + e.getPedidoId() + ": " + e.getPlato() + "!"));
        bus.suscribir(BandaTocandoEvent.class, e
                -> System.out.println("[PANEL LED] La banda " + e.getNombreBanda() + " está tocando " + e.getNombreCancion() + "!"));
    }
}
