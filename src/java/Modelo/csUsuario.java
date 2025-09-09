package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class csUsuario {

    private Connection con;
    private Statement stm;
    private ResultSet rs;

    public csUsuario() {
        this.con = null;
        this.stm = null;
    }

    // Inserción de datos
    public int InserUsuario(String Usuario, String Contrasena) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("insert into Proyectoticket.dbo.Usuario(Usuario,Contrasena) " +
                    "values('" + Usuario + "', '" + Contrasena + "')");
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
            // Manejo de errores opcional
        }
        return respuesta;
    }

    // Actualización de datos
    public int actualizarUsuario(String Usuario, String contrasena, int IDUsuario) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("update Proyectoticket.dbo.Usuario set " +
                    "Usuario='" + Usuario + "', " +
                    "Contrasena='" + contrasena + "' " +
                    "where IDUsuario = " + IDUsuario);
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
            // Manejo de errores opcional
        }
        return respuesta;
    }

    // Eliminación de datos
    public int eliminarUsuario(int IDUsuario) {
        int respuesta = 0;
        csConexion c1 = new csConexion();
        con = c1.conectar();

        try {
            stm = con.createStatement();
            respuesta = stm.executeUpdate("delete from Proyectoticket.dbo.Usuario where IDUsuario = " + IDUsuario);
            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
            // Manejo de errores opcional
        }
        return respuesta;
    }

    // Listar todos los usuarios
    public ArrayList<usuarioact> listarUsuario() {
        usuarioact p = null;
        ArrayList<usuarioact> lista = new ArrayList<usuarioact>();

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from Proyectoticket.dbo.Usuario");

            while (rs.next()) {
                p = new usuarioact(rs.getString("Usuario"), rs.getString("Contrasena"), rs.getInt(1));
                lista.add(p);
            }

            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
            // Manejo de errores opcional
        }
        return lista;
    }

    // Listar usuario por ID
    public usuarioact listarUsuarioID(int IDUsuario) {
        usuarioact p = null;

        csConexion c1 = new csConexion();
        con = c1.conectar();
        rs = null;

        try {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from Proyectoticket.dbo.Usuario where IDUsuario = " + IDUsuario);

            while (rs.next()) {
                p = new usuarioact(rs.getString("Usuario"), rs.getString("Contrasena"), rs.getInt(1));
            }

            c1.desconectar();
            con.close();
            stm.close();
        } catch (Exception ex) {
            // Manejo de errores opcional
        }
        return p;
    }
}