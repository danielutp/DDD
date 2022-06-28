package co.com.sofka.logisticaproductos.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logisticaproductos.cliente.values.ClienteId;

public class RolCuentaCambiada extends DomainEvent {

    private final String rolCuenta;
    private final ClienteId id;

    public RolCuentaCambiada(ClienteId id, String rolCuenta) {
        super("co.com.sofka.logisticaproductos.RolCuentaCambiada");
        this.id = id;
        this.rolCuenta = rolCuenta;
    }

    public String getRolCuenta() {
        return rolCuenta;
    }

}
