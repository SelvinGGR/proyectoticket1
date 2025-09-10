
package Modelo;


public class acact {    
private int IDEmpleado, IDUsuario,IDAtencion;
    public acact(int IDEmpleado, int IDUsuario, int IDAtencion)
        
{
this.IDEmpleado=IDEmpleado;
this.IDUsuario=IDUsuario;

}

//metodo get y metodo set

    public int getIDEmpleado() {
        return IDEmpleado;
    }

    public void setIDEmpleado(int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }
    
    public int getIDAtencion() {
        return IDAtencion;
    }

    public void setAtencion(int IDAtencion) {
        this.IDAtencion = IDAtencion;
    }



}


