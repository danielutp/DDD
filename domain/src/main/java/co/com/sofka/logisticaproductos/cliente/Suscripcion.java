package co.com.sofka.logisticaproductos.cliente;

import co.com.sofka.domain.generic.Entity;
import co.com.sofka.logisticaproductos.cliente.values.Beneficios;
import co.com.sofka.logisticaproductos.cliente.values.SuscripcionId;
import co.com.sofka.logisticaproductos.cliente.values.TipoSuscripcion;

public class Suscripcion extends Entity<SuscripcionId> {

    private TipoSuscripcion tipoSuscripcion;
    private Beneficios beneficios;

    public Suscripcion(SuscripcionId id, TipoSuscripcion tipoSuscripcion) {
        super(id);
        this.tipoSuscripcion = tipoSuscripcion;
    }

    public void cambiarTipoDeSuscripcion(Integer valor,Boolean suscrito){
        this.tipoSuscripcion = tipoSuscripcion.cambiarSuscripcion(valor,suscrito);
    }
}
