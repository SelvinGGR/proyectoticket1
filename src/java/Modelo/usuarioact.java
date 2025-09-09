
package Modelo;


public class usuarioact {
private String Usuario, Contrasena;
private int IDUsuario;

public usuarioact(String Usuario, String Contrasena,int IDUsuario)
        
{
this.Usuario=Usuario;
this.Contrasena=Contrasena;

}

//metodo get y metodo set

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }


    
}
