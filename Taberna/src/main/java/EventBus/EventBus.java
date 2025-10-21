
package EventBus;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;

public class EventBus implements Broker {

    private final Map<Class<?>, List<Consumer<?>>> listeners = new ConcurrentHashMap<>();

    @Override
    public <T> void suscribir(Class<T> tipoEvento, Consumer<T> listener) {
        listeners.computeIfAbsent(tipoEvento, k -> new ArrayList<>()).add(listener);
    }

    @Override
    public <T> void desuscribir(Class<T> tipoEvento, Consumer<T> listener) {
        List<Consumer<?>> subs = listeners.get(tipoEvento);
        if (subs != null) {
            subs.remove(listener);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> void publicar(T evento) {
        List<Consumer<?>> subs = listeners.get(evento.getClass());
        if (subs != null) {
            for (Consumer<?> sub : subs) {
                ((Consumer<T>) sub).accept(evento);
            }
        }
    }
}
