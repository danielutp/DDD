package co.com.sofka.logisticaproductos.cliente;
import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.logisticaproductos.cliente.events.AsociarCuenta;
import co.com.sofka.logisticaproductos.cliente.events.ClienteCreado;
import co.com.sofka.logisticaproductos.cliente.events.RolCuentaCambiada;
import co.com.sofka.logisticaproductos.cliente.events.TipoDeSuscripcionCambiada;
import co.com.sofka.logisticaproductos.cliente.values.ClienteId;
import co.com.sofka.logisticaproductos.cliente.values.DatosUsuario;
import co.com.sofka.logisticaproductos.cliente.values.TipoSuscripcion;

import java.util.List;

public class Cliente extends AggregateEvent<ClienteId> {

    protected DatosUsuario datosUsuario;
    protected Cuenta cuenta;
    protected Suscripcion suscripcion;


    public Cliente(ClienteId id,Cuenta cuenta,Suscripcion suscripcion) {
        super(id);
        appendChange(new ClienteCreado(cuenta,suscripcion)).apply();
        subscribe(new ClienteEventChange(this));
    }

    private Cliente(ClienteId id) {
        super(id);
        subscribe(new ClienteEventChange(this));
    }

    public void asociarCuenta(Cuenta cuenta){
        appendChange(new AsociarCuenta(cuenta)).apply();

    }

    public void cambiarRolCuenta(ClienteId id,String rolCuenta){
        appendChange(new RolCuentaCambiada(id, rolCuenta)).apply();
    }

    public void cambiarTipoDeSuscripcion(ClienteId id,Integer valor, boolean tipoSuscripcionCuenta){
        appendChange(new TipoDeSuscripcionCambiada(id, valor ,tipoSuscripcionCuenta)).apply();
    }


    public static Cliente from(ClienteId id, List<DomainEvent> events){
        var cliente = new Cliente((id));
        events.forEach(cliente::applyEvent);
        return cliente;
    }

}