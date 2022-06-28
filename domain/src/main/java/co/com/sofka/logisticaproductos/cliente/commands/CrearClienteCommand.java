package co.com.sofka.logisticaproductos.cliente.commands;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.logisticaproductos.cliente.Cuenta;
import co.com.sofka.logisticaproductos.cliente.Suscripcion;
import co.com.sofka.logisticaproductos.cliente.values.DatosUsuario;

public class CrearClienteCommand extends Command {

    private final DatosUsuario datosUsuario;
    private final Cuenta cuenta;
    private final Suscripcion suscripcion;


    public CrearClienteCommand(DatosUsuario datosUsuario, Cuenta cuenta, Suscripcion suscripcion) {
        this.datosUsuario = datosUsuario;
        this.cuenta = cuenta;
        this.suscripcion = suscripcion;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public Suscripcion getSuscripcion() {
        return suscripcion;
    }

    public DatosUsuario getDatosUsuario() {
        return datosUsuario;
    }

}
