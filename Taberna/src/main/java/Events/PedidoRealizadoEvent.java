
package Events;

import java.util.List;

public record PedidoRealizadoEvent(int mesaId, int pedidoId, List<String> items) {

}


