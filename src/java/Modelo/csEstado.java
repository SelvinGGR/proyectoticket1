
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
public class csEstado {
    private Connection con; //open y close a la base de datos
private Statement stm;  // permite hacer el insert update delete y select
private ResultSet rs; //contenedor de datos

public csEstado(){
this.con=null;
this.stm=null;
    
}
//insercion de datos

public int InsertarEstado(int IDUsuario, int IDEmpleado, String Estado)
{
    int respuesta=0;
    //instancia de la clase conexion
    csConexion c1 = new csConexion();
   con = c1.conectar();
   
    
    try
    {
         stm=con.createStatement();
    respuesta = stm.executeUpdate("insert into Proyectoticket.dbo.Estado(IDUsuario,IDEmpleado,Estado)"
            + "values("+ IDUsuario + ", " + IDEmpleado + ", '" + Estado + "')");
    c1.desconectar();
    con.close();
    stm.close();
    }
    
    catch (Exception ex)
    {
     
        
    }    
    return respuesta;
}   

public int actualizarEstado(int IDUsuario, int IDEmpleado, String Estado,int IDEstado)

{
    int respuesta =0;
    csConexion c1 = new csConexion();
    con=c1.conectar();
    
    try {
     stm=con.createStatement();
    respuesta = stm.executeUpdate("update Proyectoticket.dbo.Estado set "
            + "IDUsuario=" + IDUsuario + ", "
            + "IDEmpleado = " + IDEmpleado + ", "
            + "Estado = '" + Estado + "' "
            + "where IDEstado = " + IDEstado + " "); 
    c1.desconectar();
    con.close();
    stm.close();
    }
    catch (Exception ex)
    {
        
    }
    return respuesta;
}
public int eliminarEstado(int IDEstado){
    int respuesta=0;
    csConexion c1 = new csConexion();
    con=c1.conectar();
  
    try {
        stm=con.createStatement();
        respuesta = stm.executeUpdate("delete from Proyectoticket.dbo.Estado where IDEstado = " 
                + IDEstado + "");
        c1.desconectar();
        con.close();
        stm.close();
    }
    catch (Exception ex)
    {
    
    }
    return respuesta;
}
public ArrayList <estadoact> listarEstado()
{
    estadoact  p = null;
    ArrayList<estadoact> lista = new ArrayList<estadoact>();
    lista=null;
    
    csConexion c1 = new csConexion();
    con=c1.conectar();
    rs=null;
    
    try{
        stm=con.createStatement();
        rs = stm.executeQuery("select * from Proyectoticket.dbo.Estado");
        
        while (rs.next())
            
        {
            p = new estadoact(rs.getInt("IDUsuario"),rs.getInt("IDEmpleado"),rs.getString("Estado"),
            rs.getInt(1));
            lista.add(p);
        }
        
        c1.desconectar();
        con.close();
        stm.close();
    }
    catch(Exception ex)
    {
    
    }
    return lista;
    
}
public estadoact listarEstadoPorID(int IDEstado)
{
    estadoact p = null;
    
    csConexion c1 = new csConexion();
    con=c1.conectar();
    rs=null;
    
    try{
        stm=con.createStatement();
        rs = stm.executeQuery("select * from Proyectoticket.dbo.Estado where IDEstado = " + IDEstado + "");
        
        while (rs.next())
            
        {
            p = new estadoact(rs.getInt("IDUsuario"),rs.getInt("IDEmpleado"),rs.getString("Estado"),
            rs.getInt(1));
            
        }
        
        c1.desconectar();
        con.close();
        stm.close();
    }
    catch(Exception ex)
    {
    
    }
    return p;
    
}

}

