
package Modelo;


public class estadoact {
    private String Estado;
private int IDUsuario,IDEmpleado,IDEstado;
    

public estadoact(int IDUsuario, int IDEmpleado, String Estado,int IDEstado)
        
{
this.IDUsuario=IDUsuario;
this.IDEmpleado=IDEmpleado;
this.Estado=Estado;
}
 public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

     public int getIDEmpleado() {
        return IDEmpleado;
    }

    public void setIDEmpleado(int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
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



}
