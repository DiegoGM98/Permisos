package Permisos_municipales;
import java.util.Date;


class EventoEspecialPermiso extends PermisoMunicipal {
    private String tipoEvento;
    private int cantidadAsistentes;
    private String medidasSeguridad;

    public EventoEspecialPermiso(int id, String tipo, Date fechaEmision, Date fechaVencimiento, double costoBase,
                                 String tipoEvento, int cantidadAsistentes, String medidasSeguridad) {
        super(id, tipo, fechaEmision, fechaVencimiento, costoBase);
        this.tipoEvento = tipoEvento;
        this.cantidadAsistentes = cantidadAsistentes;
        this.medidasSeguridad = medidasSeguridad;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public int getCantidadAsistentes() {
        return cantidadAsistentes;
    }

    public String getMedidasSeguridad() {
        return medidasSeguridad;
    }
}

