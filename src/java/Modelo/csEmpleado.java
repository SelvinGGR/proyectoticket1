
package Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class csEmpleado {

private Connection con; //open y close a la base de datos
private Statement stm;  // permite hacer el insert update delete y select
private ResultSet rs; //contenedor de datos

public csEmpleado(){
this.con=null;
this.stm=null;

}

//insercion de datos

public int InsertarEmpleado(String Puesto, String Departamento,String Nombre, String Correo, String Telefono, int IDEmpresa)
{
    int respuesta=0;
    //instancia de la clase conexion
    csConexion c1 = new csConexion();
   con = c1.conectar();
   
    
    try
    {
         stm=con.createStatement();
    respuesta = stm.executeUpdate("insert into Proyectoticket.dbo.Empleado(Puesto,Departamento,Nombre,Correo,Telefono,IDEmpresa)"
            + "values('"+ Puesto + "', '" + Departamento + "','" + Nombre + "', '" + Correo + "', '" + Telefono + "'," + IDEmpresa + ")");
    c1.desconectar();
    con.close();
    stm.close();
    }
    
    catch (Exception ex)
    {
     
        
    }    
    return respuesta;
}   

public int actualizarEmpleado(String Puesto, String Departamento,String Nombre, String Correo, String Telefono,int IDEmpresa, int IDEmpleado)

{
    int respuesta =0;
    csConexion c1 = new csConexion();
    con=c1.conectar();
    
    try {
     stm=con.createStatement();
    respuesta = stm.executeUpdate("update Proyectoticket.dbo.Empleado set "
            + "Puesto='" + Puesto + "', "
            + "Departamento = '" + Departamento + "', "
            + "Nombre = '" + Nombre + "', "
            + "Correo = '" + Correo + "', "
            + "Telefono = '" + Telefono + "'"
            + "IDEmpresa = " + IDEmpresa + ""
            + "where IDEmpleado = " + IDEmpleado + " "); 
    c1.desconectar();
    con.close();
    stm.close();
    }
    catch (Exception ex)
    {
        
    }
    return respuesta;
}
public int eliminar(int IDEmpleado){
    int respuesta=0;
    csConexion c1 = new csConexion();
    con=c1.conectar();
  
    try {
        stm=con.createStatement();
        respuesta = stm.executeUpdate("delete from Proyectoticket.dbo.Empleado where IDEmpleado = " 
                + IDEmpleado + "");
        c1.desconectar();
        con.close();
        stm.close();
    }
    catch (Exception ex)
    {
    
    }
    return respuesta;
}
public ArrayList <empleadoact> listarEmpleado()
{
    empresaact  p = null;
    ArrayList<empleadoact> lista = new ArrayList<empleadoact>();
    lista=null;
    
    csConexion c1 = new csConexion();
    con=c1.conectar();
    rs=null;
    
    try{
        stm=con.createStatement();
        rs = stm.executeQuery("select * from Proyectoticket.dbo.Empleado");
        
        while (rs.next())
            
        {
            p = new empleadoact(rs.getString("Puesto"),rs.getString("Departamento"),rs.getString("Nombre"),rs.getString("Correo"),rs.getString("Telefono"),rs.getInt("IDEmpresa"),
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
public empleadoact listarEmpleadoPorID(int IDEmpleado)
{
    empresaact p = null;
    
    csConexion c1 = new csConexion();
    con=c1.conectar();
    rs=null;
    
    try{
        stm=con.createStatement();
        rs = stm.executeQuery("select * from Proyectoticket.dbo.Empleado where IDEmpleado = " + IDEmpleado + "");
        
        while (rs.next())
            
        {
            p = new empleadoact(rs.getString("Puesto"),rs.getString("Departamento"),rs.getString("Nombre"),rs.getString("Correo"),rs.getString("Telefono"),rs.getInt("IDEmpleado"),
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
