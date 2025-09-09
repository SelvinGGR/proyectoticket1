
package Modelo;

public class motivoact {
private String Descripcion;
private int IDUsuario, IDMotivo;

public motivoact(int IDUsuario, String Descripcion, int IDMotivo)
        
{
this.IDUsuario=IDUsuario;
this.Descripcion=Descripcion;

}

//metodo get y metodo set

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    
    public int getIDMotivo() {
        return IDMotivo;
    }

    public void setIDMotivo(int IDMotivo) {
        this.IDMotivo = IDMotivo;
    }



}
