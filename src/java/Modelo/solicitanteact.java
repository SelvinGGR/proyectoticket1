/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Raul
 */
public class solicitanteact 
{
    private String Nombre, FechaNacimiento,Telefono,Direccion,Email,Dpi;
    private int IDSolicitante,IDUsuario;

    public solicitanteact(String Nombre, String FechaNacimiento, String Telefono, String Direccion, String Email, String Dpi, int IDSolicitante, int IDUsuario) 
    {
        this.Nombre = Nombre;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Email = Email;
        this.Dpi = Dpi;
        this.IDSolicitante = IDSolicitante;
        this.IDUsuario = IDUsuario;
    }

    public String getNombre()
    {
        return Nombre;
    }

    public void setNombre(String Nombre) 
    {
        this.Nombre = Nombre;
    }

    public String getFechaNacimiento() 
    {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) 
    {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getTelefono() 
    {
        return Telefono;
    }

    public void setTelefono(String Telefono) 
    {
        this.Telefono = Telefono;
    }

    public String getDireccion() 
    {
        return Direccion;
    }

    public void setDireccion(String Direccion)
    {
        this.Direccion = Direccion;
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String Email)
    {
        this.Email = Email;
    }

    public String getDpi()
    {
        return Dpi;
    }

    public void setDpi(String Dpi)
    {
        this.Dpi = Dpi;
    }

    public int getIDSolicitante()
    {
        return IDSolicitante;
    }

    public void setIDSolicitante(int IDSolicitante) 
    {
        this.IDSolicitante = IDSolicitante;
    }

    public int getIDUsuario()
    {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario)
    {
        this.IDUsuario = IDUsuario;
    }
   
}
