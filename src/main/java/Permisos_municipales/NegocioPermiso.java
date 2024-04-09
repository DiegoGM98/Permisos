package Permisos_municipales;

import java.util.Date;


class NegocioPermiso extends PermisoMunicipal {
    private String tipoNegocio;
    private double tamanoLocal;
    private int cantidadEmpleados;

    public NegocioPermiso(int id, String tipo, Date fechaEmision, Date fechaVencimiento, double costoBase,
                          String tipoNegocio, double tamanoLocal, int cantidadEmpleados) {
        super(id, tipo, fechaEmision, fechaVencimiento, costoBase);
        this.tipoNegocio = tipoNegocio;
        this.tamanoLocal = tamanoLocal;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public String getTipoNegocio() {
        return tipoNegocio;
    }

    public double getTamanoLocal() {
        return tamanoLocal;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }
}

