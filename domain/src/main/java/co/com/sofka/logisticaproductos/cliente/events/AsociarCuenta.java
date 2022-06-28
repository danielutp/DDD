package co.com.sofka.logisticaproductos.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logisticaproductos.cliente.Cuenta;

public class AsociarCuenta extends DomainEvent {
    private final Cuenta cuenta;
    public AsociarCuenta(Cuenta cuenta) {
        super("co.com.sofka.logisticaproductos.asociarCuenta");
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
}
