package co.com.sofka.logisticaproductos.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Beneficios implements ValueObject<Beneficios.Props> {

    private final Integer descuento;
    private final String promocion;

    public Beneficios(Integer descuento, String promocion) {
        this.descuento = Objects.requireNonNull(descuento,"No puede ser null");
        this.promocion = Objects.requireNonNull(promocion,"No puede ser null");
    }

    @Override
    public Props value() {
        return new Props() {
            @Override
            public Integer descuento() {
                return null;
            }

            @Override
            public String promocion() {
                return null;
            }
        };
    }

    public interface Props {

        Integer descuento();
        String promocion();

    }

}