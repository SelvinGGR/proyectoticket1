package Modelo;


public class ticketact {
    private String Fecha, Hora, Estado;
private int IDMotivo, IDUsuario, IDEstado, IDAtencion, IDTicket;

public ticketact(int IDMotivo, int IDUsuario, String Fecha, String Hora,String Estado,int IDEstado,int IDAtencion,int IDEmpresa)
        
{
this.IDMotivo=IDMotivo;
this.IDUsuario=IDUsuario;
this.Fecha=Fecha;
this.Hora=Hora;
this.Estado=Estado;
this.IDEstado=IDEstado;
this.IDAtencion=IDAtencion;
}

//metodo get y metodo set

    public int getIDMotivo() {
        return IDMotivo;
    }

    public void setIDMotivo(int IDMotivo) {
        this.IDMotivo = IDMotivo;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    } 
    
    
    public int getIDEstado() {
        return IDEstado;
    }

    public void setIDEstado(int IDEstado) {
        this.IDEstado = IDEstado;
    }

   public int getIDAtencion() {
        return IDAtencion;
    }

    public void setIDAtencion(int IDAtencion) {
        this.IDAtencion = IDAtencion;
    }
 public int getIDTicket() {
        return IDTicket;
    }

    public void setIDTicket(int IDTicket) {
        this.IDTicket = IDTicket;
    }
}

    

