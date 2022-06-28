package co.com.sofka.logisticaproductos.cliente;
import co.com.sofka.domain.generic.EventChange;
import co.com.sofka.logisticaproductos.cliente.events.AsociarCuenta;
import co.com.sofka.logisticaproductos.cliente.events.ClienteCreado;
import co.com.sofka.logisticaproductos.cliente.events.RolCuentaCambiada;
import co.com.sofka.logisticaproductos.cliente.events.TipoDeSuscripcionCambiada;

public class ClienteEventChange extends EventChange {
         public ClienteEventChange(Cliente cliente) {

            apply((ClienteCreado event) ->{
                cliente.cuenta = event.getCuenta();;
                cliente.suscripcion= event.getSuscripcion();
                cliente.datosUsuario=null;
            });

            apply((AsociarCuenta event) ->{
                cliente.cuenta = event.getCuenta();
            });

            apply((RolCuentaCambiada event) ->{
                cliente.cuenta.cambiarRol(event.getRolCuenta());
            });

             apply((TipoDeSuscripcionCambiada event) ->{
                 cliente.suscripcion.cambiarTipoDeSuscripcion(event.getValor(),event.getTipoSuscripcion());
             });

         }
}