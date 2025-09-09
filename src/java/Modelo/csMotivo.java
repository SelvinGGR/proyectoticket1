
package Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class csMotivo {
    private Connection con; //open y close a la base de datos
private Statement stm;  // permite hacer el insert update delete y select
private ResultSet rs; //contenedor de datos

public csMotivo(){
this.con=null;
this.stm=null;

}

//insercion de datos

public int InsertarMotivo(int IDUsuario, String Descripcion)
{
    int respuesta=0;
    //instancia de la clase conexion
    csConexion c1 = new csConexion();
   con = c1.conectar();
   
    
    try
    {
         stm=con.createStatement();
    respuesta = stm.executeUpdate("insert into Proyectoticket.dbo.Motivo(IDUsuario,Descripcion)"
            + "values('"+ IDUsuario + "', '" + Descripcion + "')");
    c1.desconectar();
    con.close();
    stm.close();
    }
    
    catch (Exception ex)
    {
     
        
    }    
    return respuesta;
}   

public int actualizarMotivo(int IDUsuario, String Descripcion,int IDMotivo)

{
    int respuesta =0;
    csConexion c1 = new csConexion();
    con=c1.conectar();
    
    try {
     stm=con.createStatement();
    respuesta = stm.executeUpdate("update Proyectoticket.dbo.Motivo set "
            + "IDUsuario=" + IDUsuario + ", "
            + "Descripcion = '" + Descripcion + "' "          
            + "where IDMotivo = " + IDMotivo + " "); 
    c1.desconectar();
    con.close();
    stm.close();
    }
    catch (Exception ex)
    {
        
    }
    return respuesta;
}
public int eliminarMotivo(int IDMotivo){
    int respuesta=0;
    csConexion c1 = new csConexion();
    con=c1.conectar();
  
    try {
        stm=con.createStatement();
        respuesta = stm.executeUpdate("delete from Proyectoticket.dbo.Motivo where IDMotivo = " 
                + IDMotivo + "");
        c1.desconectar();
        con.close();
        stm.close();
    }
    catch (Exception ex)
    {
    
    }
    return respuesta;
}
public ArrayList <motivoact> listarMotivo()
{
    motivoact  p = null;
    ArrayList<motivoact> lista = new ArrayList<motivoact>();
    lista=null;
    
    csConexion c1 = new csConexion();
    con=c1.conectar();
    rs=null;
    
    try{
        stm=con.createStatement();
        rs = stm.executeQuery("select * from Proyectoticket.dbo.Motivo");
        
        while (rs.next())
            
        {
            p = new motivoact(rs.getInt("IDUsuario"),rs.getString("Descripcion"),
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
public motivoact listarMotivoPorID(int IDMotivo)
{
    motivoact p = null;
    
    csConexion c1 = new csConexion();
    con=c1.conectar();
    rs=null;
    
    try{
        stm=con.createStatement();
        rs = stm.executeQuery("select * from Proyectoticket.dbo.Motivo where IDMotivo = " + IDMotivo + "");
        
        while (rs.next())
            
        {
            p = new motivoact(rs.getInt("IDUsuario"),rs.getString("Descripcion"),
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
