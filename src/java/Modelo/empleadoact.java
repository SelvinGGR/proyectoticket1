
package Modelo;

public class empleadoact {
private String Puesto, Departamento, Nombre,Correo, Telefono;
private int IDEmpresa, IDEmpleado;
public  empleadoact (String Puesto, String Departamento,String Nombre, String Correo, String Telefono,int IDEmpresa, int IDEmpleado)
{
this.Puesto=Puesto;
this.Departamento=Departamento;
this.Nombre=Nombre;
this.Correo=Correo;
this.Telefono=Telefono;
this.IDEmpleado=IDEmpleado;
}

//metodo get y metodo set

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

     public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getIDEmpresa() {
        return IDEmpresa;
    }

    public void setIDEmpresa(int IDEmpresa) {
        this.IDEmpresa = IDEmpresa;
    }
public int getIDEmpleado() {
        return IDEmpleado;
    }

    public void setIDEmpleado(int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }
}
