package dto;



/**
 *
 * @author jorge
 */
public class RegistroDTO {
    
    private String fecha;
    private String origen;
    private String destino;
    private String mssi;
    private String router;
    private String user;
    private String dato;
    private String banderas;
    private String canal;
    
    public RegistroDTO(String fecha, String data) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getMssi() {
        return mssi;
    }

    public void setMssi(String mssi) {
        this.mssi = mssi;
    }

    public String getRouter() {
        return router;
    }

    public void setRouter(String router) {
        this.router = router;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public String getBanderas() {
        return banderas;
    }

    public void setBanderas(String banderas) {
        this.banderas = banderas;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }
    
  
    
}
