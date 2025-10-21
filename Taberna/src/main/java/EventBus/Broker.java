
package EventBus;

public interface Broker {
    <T> void suscribir(Class<T> tipoEvento, java.util.function.Consumer<T> listener);
    <T> void desuscribir(Class<T> tipoEvento, java.util.function.Consumer<T> listener);
    <T> void publicar(T evento);
}