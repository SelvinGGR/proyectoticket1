
package Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class csAtencionCliente {

  private Connection con; //open y close a la base de datos
private Statement stm;  // permite hacer el insert update delete y select
private ResultSet rs; //contenedor de datos

public csAtencionCliente(){
this.con=null;
this.stm=null;    
}

//insercion de datos

public int InsertarAC(int IDEmpleado, int IDUsuario)
{
    int respuesta=0;
    //instancia de la clase conexion
    csConexion c1 = new csConexion();
   con = c1.conectar();
   
    
    try
    {
         stm=con.createStatement();
    respuesta = stm.executeUpdate("insert into Proyectoticket.dbo.AtencionCliente(IDEmpleado,IDUsuario)"
            + "values('"+ IDEmpleado + "', '" + IDUsuario + "')");
    c1.desconectar();
    con.close();
    stm.close();
    }
    
    catch (Exception ex)
    {
     
        
    }    
    return respuesta;
}   

public int actualizarAC(int IDEmpleado, int IDUsuario,int IDAtencion)

{
    int respuesta =0;
    csConexion c1 = new csConexion();
    con=c1.conectar();
    
    try {
     stm=con.createStatement();
    respuesta = stm.executeUpdate("update Proyectoticket.dbo.AtencionCliente set "
            + "IDEmpleado=" + IDEmpleado + ", "
            + "IDUsuario = " + IDUsuario + " "          
            + "where IDAtencion = " + IDAtencion + " "); 
    c1.desconectar();
    con.close();
    stm.close();
    }
    catch (Exception ex)
    {
        
    }
    return respuesta;
}
public int eliminarAC(int IDAtencion){
    int respuesta=0;
    csConexion c1 = new csConexion();
    con=c1.conectar();
  
    try {
        stm=con.createStatement();
        respuesta = stm.executeUpdate("delete from Proyectoticket.dbo.AtencionCliente where IDAtencion = " 
                + IDAtencion + "");
        c1.desconectar();
        con.close();
        stm.close();
    }
    catch (Exception ex)
    {
    
    }
    return respuesta;
}
public ArrayList <acact> listarAC()
{
    acact  p = null;
    ArrayList<acact> lista = new ArrayList<acact>();
    lista=null;
    
    csConexion c1 = new csConexion();
    con=c1.conectar();
    rs=null;
    
    try{
        stm=con.createStatement();
        rs = stm.executeQuery("select * from Proyectoticket.dbo.AtencionCliente");
        
        while (rs.next())
            
        {
            p = new acact(rs.getInt("IDEmpleado"),rs.getInt("IDUsuario"),
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
public acact listarACPorID(int IDAtencion)
{
    acact p = null;
    
    csConexion c1 = new csConexion();
    con=c1.conectar();
    rs=null;
    
    try{
        stm=con.createStatement();
        rs = stm.executeQuery("select * from Proyectoticket.dbo.AtencionCliente where IDAtencion = " + IDAtencion + "");
        
        while (rs.next())
            
        {
            p = new acact(rs.getInt("IDEmpleado"),rs.getInt("IDUsuario"),
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

