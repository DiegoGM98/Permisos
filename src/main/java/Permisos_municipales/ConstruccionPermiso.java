package Permisos_municipales;

import java.util.Date;


class ConstruccionPermiso extends PermisoMunicipal {
    private String tipoConstruccion;
    private double metrosCuadrados;

    public ConstruccionPermiso(int id, String tipo, Date fechaEmision, Date fechaVencimiento, double costoBase,
                               String tipoConstruccion, double metrosCuadrados) {
        super(id, tipo, fechaEmision, fechaVencimiento, costoBase);
        this.tipoConstruccion = tipoConstruccion;
        this.metrosCuadrados = metrosCuadrados;
    }

    public String getTipoConstruccion() {
        return tipoConstruccion;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
}

