
package Componentes;

import EventBus.EventBus;
import Events.BandaTocandoEvent;

public class Banda {
    private final EventBus bus;

    public Banda(EventBus bus) {
        this.bus = bus;
    }

    public void tocarCancion(String nombreBanda, String nombreCancion, int duracion) {
        System.out.println("[Banda] Tocando: " + nombreCancion + " de " + nombreBanda);
        bus.publicar(new BandaTocandoEvent(nombreBanda, nombreCancion, duracion));
    }
}