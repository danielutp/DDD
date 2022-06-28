package co.com.sofka.logisticaproductos.cliente;
import co.com.sofka.domain.generic.Entity;
import co.com.sofka.logisticaproductos.cliente.values.CuentaId;
import co.com.sofka.logisticaproductos.cliente.values.Preferencias;
import co.com.sofka.logisticaproductos.cliente.values.Rol;

public class Cuenta extends Entity<CuentaId> {
    private Preferencias preferencias;
    private Rol rol;


    public Cuenta(CuentaId id,Rol rol) {
        super(id);
        this.rol = rol;
    }

    public void cambiarRol(String role){
        this.rol = rol.cambiarRol(role);
    }

}