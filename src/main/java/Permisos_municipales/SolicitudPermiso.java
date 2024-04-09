package Permisos_municipales;

import java.util.Date;


class SolicitudPermiso {
    private Ciudadano ciudadano;
    private PermisoMunicipal permiso;
    private Date fechaTransaccion;

    public SolicitudPermiso(Ciudadano ciudadano, PermisoMunicipal permiso, Date fechaTransaccion) {
        this.ciudadano = ciudadano;
        this.permiso = permiso;
        this.fechaTransaccion = fechaTransaccion;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public PermisoMunicipal getPermiso() {
        return permiso;
    }

    public Date getFechaTransaccion() {
        return fechaTransaccion;
    }
}
