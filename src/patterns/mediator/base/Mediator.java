package patterns.mediator.base;

/**
 * Абстрактный класс "Посредник"
 */
public abstract class Mediator {

    /**
     * Отправка сообщения {@code message} указанному получателю {@code colleague}
     * @param message отправляемое сообщение
     * @param colleague получатель сообщения
     */
    public abstract void Send(String message, Colleague colleague);
}
