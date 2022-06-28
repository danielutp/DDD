package co.com.sofka.logisticaproductos.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Preferencias implements ValueObject<Preferencias.Props> {

    private final String restaurante;
    private final String tipoComida;

    public Preferencias(String restaurante, String tipoComida) {
        this.restaurante = Objects.requireNonNull(restaurante,"No puede ser null");
        this.tipoComida = Objects.requireNonNull(tipoComida,"No puede ser null");
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public String restaurante() {
                return restaurante;
            }

            @Override
            public String tipoComida() {
                return tipoComida;
            }
        };
    }

    public interface Props{
        String restaurante();
        String tipoComida();
    }
}
