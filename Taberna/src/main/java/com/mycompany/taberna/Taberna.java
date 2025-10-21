
package com.mycompany.taberna;

import Componentes.*;
import java.util.List;

public class Taberna {
    public static void main(String[] args) {
        EventBus bus = new EventBus();

        new Barra(bus);
        new Cocina(bus);
        new SistemaDeSonido(bus);
        new PanelLED(bus);
        new SistemaDeHumo(bus);


        Banda banda = new Banda(bus);
        SistemaDePedidos pedidos = new SistemaDePedidos(bus);

        banda.tocarCancion("Los Seguidores de Dijkstra", "El Algoritmo del Amor", 180);
        pedidos.recibirPedido(5, List.of("Cerveza", "Hamburguesa"));
        banda.tocarCancion("Los Seguidores de Dijkstra", "Through the Fire and Flames", 180);
    }
}
