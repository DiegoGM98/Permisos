package Permisos_municipales;

import java.util.Date;

class PermisoMunicipal {
    private int id;
    private String tipo;
    private Date fechaEmision;
    private Date fechaVencimiento;
    private double costoBase;

    public PermisoMunicipal(int id, String tipo, Date fechaEmision, Date fechaVencimiento, double costoBase) {
        this.id = id;
        this.tipo = tipo;
        this.fechaEmision = fechaEmision;
        this.fechaVencimiento = fechaVencimiento;
        this.costoBase = costoBase;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public double getCostoBase() {
        return costoBase;
    }
}

