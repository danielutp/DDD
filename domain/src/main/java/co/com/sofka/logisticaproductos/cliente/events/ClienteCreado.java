package co.com.sofka.logisticaproductos.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logisticaproductos.cliente.Cuenta;
import co.com.sofka.logisticaproductos.cliente.Suscripcion;

public class ClienteCreado extends DomainEvent {

    private final Cuenta cuenta;
    private final Suscripcion suscripcion;

    public ClienteCreado(Cuenta cuenta, Suscripcion suscripcion) {
        super("co.com.sofka.logisticaproductos.ClienteCreado");
        this.cuenta = cuenta;
        this.suscripcion = suscripcion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }
}
