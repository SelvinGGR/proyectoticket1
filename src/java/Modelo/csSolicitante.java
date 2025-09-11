package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class csSolicitante
{
    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public csSolicitante()
    {
        this.con = null;
        this.stm = null;
    }

    // INSERT
    public int InsertarSolicitante(String DPI, int IDUsuario, String Nombre, String FechaNacimiento,
                                   String Telefono, String Direccion, String Email)
    {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try
        {
            stm = con.createStatement();
            respuesta = stm.executeUpdate(
                "INSERT INTO Proyectoticket.dbo.Solicitante(DPI, IDUsuario, Nombre, FechaNacimiento, Telefono, Direccion, Email) " +
                "VALUES ('" + DPI + "', " + IDUsuario + ", '" + Nombre + "', '" + FechaNacimiento + "', '" + Telefono + "', '" + Direccion + "', '" + Email + "')"
            );
            c1.desconectar();
            con.close();
            stm.close();
        }
        catch (Exception ex)
        {
        }
        return respuesta;
    }

    // UPDATE
    public int actualizarSolicitante(String DPI, int IDUsuario, String Nombre, String FechaNacimiento,
                                     String Telefono, String Direccion, String Email, int IDSolicitante)
    {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try
        {
            stm = con.createStatement();
            respuesta = stm.executeUpdate(
                "UPDATE Proyectoticket.dbo.Solicitante SET " +
                "DPI = '" + DPI + "', " +
                "IDUsuario = " + IDUsuario + ", " +
                "Nombre = '" + Nombre + "', " +
                "FechaNacimiento = '" + FechaNacimiento + "', " +
                "Telefono = '" + Telefono + "', " +
                "Direccion = '" + Direccion + "', " +
                "Email = '" + Email + "' " +
                "WHERE IDSolicitante = " + IDSolicitante + " "
            );
            c1.desconectar();
            con.close();
            stm.close();
        }
        catch (Exception ex)
        {
        }
        return respuesta;
    }

    // DELETE
    public int eliminarSolicitante(int IDSolicitante)
    {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try
        {
            stm = con.createStatement();
            respuesta = stm.executeUpdate(
                "DELETE FROM Proyectoticket.dbo.Solicitante WHERE IDSolicitante = " + IDSolicitante + ""
            );
            c1.desconectar();
            con.close();
            stm.close();
        }
        catch (Exception ex)
        {
        }
        return respuesta;
    }

    // LISTAR TODOS
    public ArrayList<solicitanteact> listarSolicitante()
    {
        solicitanteact p = null;
        ArrayList<solicitanteact> lista = new ArrayList<solicitanteact>();

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try
        {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM Proyectoticket.dbo.Solicitante");

            while (rs.next())
            {
                p = new solicitanteact(
                        rs.getString("Nombre"),
                        rs.getString("FechaNacimiento"),
                        rs.getString("Telefono"),
                        rs.getString("Direccion"),
                        rs.getString("Email"),
                        rs.getString("DPI"),
                        rs.getInt("IDSolicitante"),
                        rs.getInt("IDUsuario")
                
                );
                lista.add(p);
            }

            c1.desconectar();
            con.close();
            stm.close();
        }
        catch (Exception ex)
        {
        }
        return lista;
    }

    // LISTAR POR ID
    public solicitanteact listarSolicitantePorID(int IDSolicitante)
    {
        solicitanteact p = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try
        {
            stm = con.createStatement();
            rs = stm.executeQuery(
                "SELECT * FROM Proyectoticket.dbo.Solicitante WHERE IDSolicitante = " + IDSolicitante + ""
            );

            while (rs.next())
            {
                p = new solicitanteact(
                        rs.getString("Nombre"),
                        rs.getString("FechaNacimiento"),
                        rs.getString("Telefono"),
                        rs.getString("Direccion"),
                        rs.getString("Email"),
                        rs.getString("DPI"),
                        rs.getInt("IDSolicitante"),
                        rs.getInt("IDUsuario")
                
                );
            }

            c1.desconectar();
            con.close();
            stm.close();
        }
        catch (Exception ex)
        {
        }
        return p;
    }
}

